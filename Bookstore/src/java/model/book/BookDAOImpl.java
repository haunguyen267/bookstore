package model.book;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.book.Book;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.book.BookDAO;
import model.person.Author;
import model.person.FullName;
import shared.ConnectDB;
import static shared.ConnectDB.conn;

public class BookDAOImpl extends ConnectDB implements BookDAO {

    private ArrayList<Book> listBook;

    public BookDAOImpl() {
        super();
    }

    /**
     *
     * @param String
     */
    public ArrayList searchBook(int String) {
        // TODO - implement BookDAOImpl.searchBook
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param Book
     */
    public void addBook(Book Book) {
        // TODO - implement BookDAOImpl.addBook
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param Book
     */
    public void updateBook(int Book) {
        // TODO - implement BookDAOImpl.updateBook
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param Book
     */
    public Book selectBook(int id) {
        Book book = new Book();
        String sql = "SELECT * FROM book as B INNER JOIN genre as G ON B.GenreID = G.ID"
                + " INNER JOIN author as A ON B.AuthorID = A.ID"
                + " INNER JOIN publisher as P ON B.PublisherID = P.ID"
                + " INNER JOIN language as L ON B.LanguageID = L.ID WHERE B.ID = ?";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                book.setName(rs.getString("name"));
                book.setGenre(new Genre(rs.getString("G.name"), ""));
                book.setPrice(rs.getFloat("Price"));
                book.setReleasedDate(rs.getDate("ReleasedDate"));
                book.setPublisher(new Publisher(rs.getString("P.Name"), null));
                book.setLanguage(new Language(rs.getString("L.Name"), null));
                int AuthorID = rs.getInt("A.ID");

                sql = "SELECT * FROM author AS A INNER JOIN fullname AS F"
                        + " WHERE A.ID = ? AND F.ID = A.FullNameID";
                PreparedStatement ps1 = (PreparedStatement) conn.prepareStatement(sql);
                ps1.setInt(1, AuthorID);

                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()) {
                    String first = rs1.getString("F.FirstName");
                    String mid = rs1.getString("F.Middlename");
                    String last = rs1.getString("F.Lastname");
                    Author author = new Author(new FullName(first, mid, last), null);
                    book.setAuthor(author);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    public void deleteBook(int Book) {
        String sql = "DELETE FROM book WHERE book.ID = ?";
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1, Book);
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList getAllBook() {
        // TODO - implement BookDAOImpl.getAllBook
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM book as B INNER JOIN genre as G ON B.GenreID = G.ID"
                + " INNER JOIN author as A ON B.AuthorID = A.ID"
                + " INNER JOIN publisher as P ON B.PublisherID = P.ID"
                + " INNER JOIN language as L ON B.LanguageID = L.ID";
        int i = 0;

        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setName(rs.getString("name"));
                book.setGenre(new Genre(rs.getString("G.name"), ""));
                book.setPrice(rs.getFloat("Price"));
                book.setReleasedDate(rs.getDate("ReleasedDate"));
                book.setPublisher(new Publisher(rs.getString("P.Name"), null));
                book.setLanguage(new Language(rs.getString("L.Name"), null));
                int AuthorID = rs.getInt("A.ID");

                sql = "SELECT * FROM author AS A INNER JOIN fullname AS F"
                        + " WHERE A.ID = ? AND F.ID = A.FullNameID";
                PreparedStatement ps1 = (PreparedStatement) conn.prepareStatement(sql);
                ps1.setInt(1, AuthorID);

                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()) {
                    String first = rs1.getString("F.FirstName");
                    String mid = rs1.getString("F.Middlename");
                    String last = rs1.getString("F.Lastname");
                    Author author = new Author(new FullName(first, mid, last), null);
                    book.setAuthor(author);
                }

                list.add(book);

            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
