/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.book.Book;
import model.book.BookDAOImpl;
import model.order.Cart;
import model.order.Item;

/**
 *
 * @author syphu
 */
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String command = request.getParameter("command");
        HttpSession httpSession = request.getSession();
        if (command.equals("push")) {
            int idBook = Integer.valueOf(request.getParameter("id"));
            Book book = new BookDAOImpl().selectBook(idBook);
            if (book != null) {

                if (httpSession.getAttribute("cart") == null) {
                    Cart cart = new Cart();
                    ArrayList<Item> listItem = new ArrayList<>();
                    Item i = new Item(idBook, book, 1, book.getPrice());
                    listItem.add(i);
                    cart.setListBook(listItem);
                    httpSession.setAttribute("cart", cart);
                } else {
                    Cart cart = (Cart) httpSession.getAttribute("cart");
                    ArrayList<Item> listItem = cart.getListItem();
                    boolean check = false;
                    for (Item item : listItem) {
                        if (item.getId() == idBook) {
                            item.setQuantity(item.getQuantity() + 1);
                            check = true;
                        }
                    }
                    if (check == false) {
                        Item i = new Item(idBook, book, 1, book.getPrice());
                        listItem.add(i);
                        cart.setListBook(listItem);
                    }
                    httpSession.setAttribute("cart", cart);

                }
                response.sendRedirect("cart.jsp");
            }
        } else if (command.equals("delete")) {
            Cart cart = (Cart) httpSession.getAttribute("cart");
            ArrayList<Item> listItem = cart.getListItem();
            int idItem = Integer.valueOf(request.getParameter("idItem"));
            listItem.remove(idItem-1);
            cart.setListBook(listItem);
            httpSession.setAttribute("cart", cart);
            response.sendRedirect("cart.jsp");
        } else if (command.equals("inc")) {
            int idItem = Integer.valueOf(request.getParameter("idItem"));
            Cart cart = (Cart) httpSession.getAttribute("cart");
            ArrayList<Item> listItem = cart.getListItem();
            for (Item item : listItem) {
                if (item.getId() == idItem) {
                    item.setQuantity(item.getQuantity() + 1);
                }
            }
            cart.setListBook(listItem);
            httpSession.setAttribute("cart", cart);
            response.sendRedirect("cart.jsp");

        } else if (command.equals("dec")) {
            
            Cart cart = (Cart) httpSession.getAttribute("cart");
            int idItem = Integer.valueOf(request.getParameter("idItem"));
            ArrayList<Item> listItem = cart.getListItem();
            for (Item item : listItem) {
                if (item.getId() == idItem) {
                    if (item.getQuantity() > 1) {
                        item.setQuantity(item.getQuantity() - 1);
                    } else {
                        listItem.remove(idItem-1);
                    }
                    break;
                }
            }
            cart.setListBook(listItem);
            httpSession.setAttribute("cart", cart);
            response.sendRedirect("cart.jsp");
        }

//        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
