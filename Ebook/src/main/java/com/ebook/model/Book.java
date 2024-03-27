package com.ebook.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookID")
	private int bookID;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "coverImagePath")
	private String coverImagePath;

	@Column(name = "pdfPath")
	private String pdfPath;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;

	@ManyToOne
	@JoinColumn(name = "categoryID")
	private Category category;

	@Column(name = "isActive")
	private boolean isActive;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<FavoriteBook> favoriteBooks;

	public Book() {
		super();
	}

	public Book(int bookID, String title, String author, String coverImagePath, String pdfPath, String description,
			Category category, boolean isActive, List<FavoriteBook> favoriteBooks) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.coverImagePath = coverImagePath;
		this.pdfPath = pdfPath;
		this.description = description;
		this.category = category;
		this.isActive = isActive;
		this.favoriteBooks = favoriteBooks;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCoverImagePath() {
		return coverImagePath;
	}

	public void setCoverImagePath(String coverImagePath) {
		this.coverImagePath = coverImagePath;
	}

	public String getPdfPath() {
		return pdfPath;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<FavoriteBook> getFavoriteBooks() {
		return favoriteBooks;
	}

	public void setFavoriteBooks(List<FavoriteBook> favoriteBooks) {
		this.favoriteBooks = favoriteBooks;
	}

}