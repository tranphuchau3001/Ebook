package com.ebook.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userID")
	private int userID;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "registrationDate")
	private Timestamp registrationDate;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "isActive")
	private boolean isActive;

	@Column(name = "isAdmin")
	private boolean isAdmin;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<FavoriteBook> favoriteBooks;

	public User() {
		super();
	}

	public User(int userID, String username, String email, String password, Timestamp registrationDate, String fullName,
			boolean isActive, boolean isAdmin, List<FavoriteBook> favoriteBooks) {
		super();
		this.userID = userID;
		this.username = username;
		this.email = email;
		this.password = password;
		this.registrationDate = registrationDate;
		this.fullName = fullName;
		this.isActive = isActive;
		this.isAdmin = isAdmin;
		this.favoriteBooks = favoriteBooks;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<FavoriteBook> getFavoriteBooks() {
		return favoriteBooks;
	}

	public void setFavoriteBooks(List<FavoriteBook> favoriteBooks) {
		this.favoriteBooks = favoriteBooks;
	}

}