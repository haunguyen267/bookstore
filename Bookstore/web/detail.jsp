<%-- 
    Document   : detail
    Created on : Nov 17, 2018, 4:03:49 PM
    Author     : syphu
--%>

<%@page import="model.book.BookDAOImpl"%>
<%@page import="model.book.Book"%>
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
        <% Book book = new BookDAOImpl().selectBook(Integer.valueOf(request.getParameter("id")));%>
        <div class="container">

            <div class="row">




                <div class="col-lg-6 col-lg-offset-3">

                    <div class="card mt-4">
                        <!--<img class="card-img-top img-fluid" src="http://placehold.it/900x400" alt="">-->
                        <div class="card-body">
                            <h3 class="card-title"><%=book.getName()%></h3>
                            <h4><%= book.getPrice() + " VND"%></h4>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sapiente dicta fugit fugiat hic aliquam itaque facere, soluta. Totam id dolores, sint aperiam sequi pariatur praesentium animi perspiciatis molestias iure, ducimus!</p>
                            <a href="CartController?command=push&id=<%= Integer.valueOf(request.getParameter("id"))%> " class="btn btn-success">Add To Cart</a>
                        </div>
                    </div>

                </div>

                <div class="col-lg-6 mt-4">
                    <div class="card" style="width:400px">
                        <!--<img class="card-img-top" src="img_avatar1.png" alt="Card image" style="width:100%">-->
                        <div class="card-body">
                            <h4 class="card-title"><%="Author: "+ book.getAuthor().getName().getFullname() %></h4>
                            <p class="card-text"><%="Publisher: "+ book.getPublisher().getName() %></p>
                            <%="Genre: "+ book.getGenre().getName() %>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </body>
</html>
