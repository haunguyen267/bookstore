package shared;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.book.Book;
import model.book.BookDAOImpl;
import model.book.Genre;
import model.book.Language;
import model.book.Publisher;
import model.person.Author;
import model.person.FullName;

/**
 *
 * @author Sy Phung
 */
public class ConnectDB {

    public static Connection conn;
    private String username = "root";
    String url = "jdbc:mysql://localhost/bookstore";
    String dbClass = "com.mysql.jdbc.Driver";

    public ConnectDB() {
        if (conn == null) {
            try {
                try {
                    Class.forName(dbClass);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
                }
                conn = (Connection) DriverManager.getConnection(url, username, "");
                System.out.println("success");
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {
        new ConnectDB();
        
    }
}
