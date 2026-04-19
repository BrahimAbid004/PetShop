package com.petshop.controller;

import com.petshop.service.AnimalService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

import java.io.IOException;
//@WebServlet("/catalogue")
public class CatalogueServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AnimalService animalService = new AnimalService();
        request.setAttribute("animaux", animalService.getAnimaux());
        request.getRequestDispatcher("/WEB-INF/catalogue.jsp").forward(request, response);

    }
}
