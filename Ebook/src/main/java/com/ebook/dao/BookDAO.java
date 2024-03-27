package com.ebook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ebook.model.Book;

public class BookDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public BookDAO() {
		entityManagerFactory = Persistence.createEntityManagerFactory("EbookPU");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Book> getAllBooks() {
		try {
			Query query = entityManager.createQuery("SELECT b FROM Book b WHERE b.isActive = true");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Book getBookByID(int bookID) {
		try {
			return entityManager.find(Book.class, bookID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void addBook(Book book) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(book);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void updateBook(Book book) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.merge(book);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteBook(int bookID) {
		EntityTransaction transaction = null;
		try {
			transaction = entityManager.getTransaction();
			transaction.begin();
			Book book = entityManager.find(Book.class, bookID);
			if (book != null) {
				book.setActive(false);
				entityManager.merge(book);
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
