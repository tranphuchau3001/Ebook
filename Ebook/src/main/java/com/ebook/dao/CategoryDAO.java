package com.ebook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ebook.model.Category;

public class CategoryDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public CategoryDAO() {
		entityManagerFactory = Persistence.createEntityManagerFactory("EbookPU");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Category> getAllCategories() {
		try {
			Query query = entityManager.createQuery("SELECT c FROM Category c");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Category getCategoryByID(int categoryID) {
		try {
			return entityManager.find(Category.class, categoryID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void addCategory(Category category) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(category);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void updateCategory(Category category) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.merge(category);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteCategory(int categoryID) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			Category category = entityManager.find(Category.class, categoryID);
			if (category != null) {
				entityManager.remove(category);
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
}
