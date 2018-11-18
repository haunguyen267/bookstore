<%-- 
    Document   : home
    Created on : Nov 17, 2018, 1:40:20 PM
    Author     : syphu
--%>

<%@page import="model.book.BookDAOImpl"%>
<%@page import="model.book.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="vendor/bootstrap/bootstrap.css">
        <title>Home Page</title>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="vendor/bootstrap/bootstrap.min.js"></script>
    </head>

    <body>
        <div class="container">
            <h2>BookStore</h2>
            <% ArrayList<Book> list = new BookDAOImpl().getAllBook(); 
                int index = 1;
            %>         
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Book Name</th>
                        <th>Genre</th>
                        <th>Author</th>
                        <th>Publisher</th>
                        <th>Language</th>
                        <th>Show</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Book elem : list) {
                        String Detail = "detail.jsp?id="+index;
                    %>
                    <tr>
                        <td><%= elem.getName() %></td>
                        <td><%= elem.getGenre().getName() %></td>
                        <td><%= elem.getAuthor().getName().getFullname() %></td>
                        <td><%= elem.getPublisher().getName() %></td>
                        <td><%= elem.getLanguage().getName() %></td>
                        <td><a href=<%= Detail %> <p>Show Detail</p> </a></td>
                    </tr>
                    <%
                        index++;
                        }
                    %>


                </tbody>
            </table>
        </div>
    </body>
</html>
