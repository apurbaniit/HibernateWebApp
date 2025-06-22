package com.example.servlet;

import java.io.IOException;

import com.example.dao.BookDao;
import com.example.entity.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;


@WebServlet("/updateBook")
public class UpdateBookServlet extends HttpServlet {
    private BookDao bookDao = new BookDao();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        Book book = bookDao.getBook(id);
        req.setAttribute("book", book);
        req.getRequestDispatcher("update-book.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        double price = Double.parseDouble(req.getParameter("price"));

        Book book = new Book(title, author, price);
        bookDao.updateBook(book);

        resp.sendRedirect("listBooks");
    }
}