package com.ebook.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "FavoriteBooks", uniqueConstraints = @UniqueConstraint(columnNames = { "userID", "bookID" }))
public class FavoriteBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "favoriteID")
	private int favoriteID;

	@ManyToOne
	@JoinColumn(name = "userID")
	private User user;

	@ManyToOne
	@JoinColumn(name = "bookID")
	private Book book;

	@Column(name = "favoriteDate")
	private Timestamp favoriteDate;

	public FavoriteBook() {
		super();
	}

	public FavoriteBook(int favoriteID, User user, Book book, Timestamp favoriteDate) {
		super();
		this.favoriteID = favoriteID;
		this.user = user;
		this.book = book;
		this.favoriteDate = favoriteDate;
	}

	public int getFavoriteID() {
		return favoriteID;
	}

	public void setFavoriteID(int favoriteID) {
		this.favoriteID = favoriteID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Timestamp getFavoriteDate() {
		return favoriteDate;
	}

	public void setFavoriteDate(Timestamp favoriteDate) {
		this.favoriteDate = favoriteDate;
	}

}