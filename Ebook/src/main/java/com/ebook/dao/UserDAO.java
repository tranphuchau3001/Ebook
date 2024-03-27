package com.ebook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ebook.model.User;

public class UserDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public UserDAO() {
		entityManagerFactory = Persistence.createEntityManagerFactory("EbookPU");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		try {
			Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.isActive = true");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public User getUserByID(int userID) {
		try {
			return entityManager.find(User.class, userID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void addUser(User user) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void updateUser(User user) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.merge(user);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteUser(int userID) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			User user = entityManager.find(User.class, userID);
			if (user != null) {
				user.setActive(false);
				entityManager.merge(user);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void close() {
		entityManager.close();
		entityManagerFactory.close();
	}

	public User doLogin(String username, String password) {
		try {
			Query query = entityManager
					.createQuery("SELECT u FROM User u WHERE u.username = :username AND u.password = :password");
			query.setParameter("username", username);
			query.setParameter("password", password);
			@SuppressWarnings("unchecked")
			List<User> users = query.getResultList();
			if (!users.isEmpty()) {
				return users.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
