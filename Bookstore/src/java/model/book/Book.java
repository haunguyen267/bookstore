package model.book;

import java.util.Date;
import model.person.Author;


public class Book {

	private String name;
	private Publisher publisher;
	private Author author;
	private Genre genre;
	private Language language;
	private Date releasedDate;
	private float price;

	public void Book() {
		// TODO - implement Book.Book
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return this.publisher;
	}

	/**
	 * 
	 * @param publisher
	 */
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return this.author;
	}

	/**
	 * 
	 * @param author
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return this.genre;
	}

	/**
	 * 
	 * @param genre
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Language getLanguage() {
		return this.language;
	}

	/**
	 * 
	 * @param language
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}

	public Date getReleasedDate() {
		return this.releasedDate;
	}

	/**
	 * 
	 * @param releasedDate
	 */
	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public float getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	

}