package com.ebook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ebook.model.FavoriteBook;

public class FavoriteDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public FavoriteDAO() {
		entityManagerFactory = Persistence.createEntityManagerFactory("EbookPU");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<FavoriteBook> getAllFavorites() {
		try {
			Query query = entityManager.createQuery("SELECT f FROM FavoriteBook f");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public FavoriteBook getFavoriteByID(int favoriteID) {
		try {
			return entityManager.find(FavoriteBook.class, favoriteID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void addFavorite(FavoriteBook favorite) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(favorite);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void updateFavorite(FavoriteBook favorite) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.merge(favorite);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteFavorite(int favoriteID) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			FavoriteBook favorite = entityManager.find(FavoriteBook.class, favoriteID);
			if (favorite != null) {
				entityManager.remove(favorite);
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
