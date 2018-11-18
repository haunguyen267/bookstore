<%-- 
    Document   : cart
    Created on : Nov 18, 2018, 3:00:46 AM
    Author     : syphu
--%>

<%@page import="model.order.Item"%>
<%@page import="model.order.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="vendor/bootstrap/bootstrap.css">
        <title>Cart</title>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="vendor/bootstrap/bootstrap.min.js"></script>
    </head>
    <body>
        <% Cart cart = (Cart) session.getAttribute("cart");
            if (cart != null) {
        %>
        <div class="container">

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Book Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total</th>
                        <th>Option</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <%int index = 1;%>
                    <%
                        for (Item elem : cart.getListItem()) {

                    %>
                    <tr>
                        <td><%= index%></td>
                        <td><%= elem.getBook().getName()%></td>
                        <td><%= elem.getBook().getPrice()%></td>
                        <td> <%= elem.getQuantity()%>

                        </td>
                        <td><%= elem.getPrice() * elem.getQuantity()%></td>
                        <td> 
                            <a href="CartController?command=inc&idItem=<%=index%>" style="display: inline-block" >
                                <p >Increase</p>
                            </a>
                            <a href="CartController?command=dec&idItem=<%=index%>" style="display: inline-block" >
                                <p>Decrease</p>
                            </a>
                        </td>
                        <td><a href="CartController?command=delete&idItem=<%=index%>"><p>Remove</p></a></td>
                    </tr>

                    <%
                            index++;
                        }
                    %>

                </tbody>
            </table>
        </div>
        <%
            }
        %>
        <div class="container">
            <a href="home.jsp" class="btn btn-success">Continue Buying</a>
        </div>
    </body>
</html>
