package com.petshop.controller;

import com.petshop.model.Panier;
import com.petshop.service.AnimalService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class PanierServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        if(session.getAttribute("panier")==null){
            session.setAttribute("panier", new Panier());
        }
        Panier panier = (Panier) session.getAttribute("panier");
        String pageDestination="/WEB-INF/panier.jsp";
        if("ajouter".equals(action) && request.getParameter("id")!=null){
            int id=Integer.parseInt(request.getParameter("id"));
            panier.ajouterAnimal(new AnimalService().getAnimalById(id));
        }
        else if ("retirer".equals(action) && request.getParameter("id")!=null){
            int id=Integer.parseInt(request.getParameter("id"));
            panier.retirerAnimal(id);
        }
        else if ("vider".equals(action)){
            panier.viderPanier();

        }
        else if("valider".equals(action) && !panier.getListeAnimaux().isEmpty()){
            panier.viderPanier();
            pageDestination="/WEB-INF/confirmation.jsp";

        }
        request.getRequestDispatcher(pageDestination).forward(request, response);
    }

}
