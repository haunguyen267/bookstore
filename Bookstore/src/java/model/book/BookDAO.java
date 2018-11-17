package model.book;

import java.util.ArrayList;

public interface BookDAO {

	/**
	 * 
	 * @param String
	 */
	ArrayList searchBook(int String);

	/**
	 * 
	 * @param Book
	 */
	void addBook(int Book);

	/**
	 * 
	 * @param Book
	 */
	void updateBook(int Book);

	/**
	 * 
	 * @param Book
	 */
	void deleteBook(int Book);

	ArrayList getAllBook();

}