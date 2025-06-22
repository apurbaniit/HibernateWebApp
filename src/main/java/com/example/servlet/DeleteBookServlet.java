package com.example.servlet;

import java.io.IOException;

import com.example.dao.BookDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;


@WebServlet("/deleteBook")
public class DeleteBookServlet extends HttpServlet {

    private BookDao bookDao = new BookDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        bookDao.deleteBook(id);
        response.sendRedirect("listBooks");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    }

}