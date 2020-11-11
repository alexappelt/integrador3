package org.prog2.controller;

import org.prog2.model.Filial;
import org.prog2.model.Produto;
import org.prog2.service.FilialService;
import org.prog2.service.ProdutoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilialController  extends HttpServlet {

    private FilialService filialService = new FilialService();



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/view/filial/index.jsp");
        view.forward(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Filial objFilial = new Filial();



        objFilial.setDescricao(req.getParameter("descricao"));
        objFilial.setLocalizacao(req.getParameter("localizacao"));
        objFilial.setSegmento(req.getParameter("segmento"));



        filialService.inserirFilial(objFilial);

        resp.sendRedirect("/listarprodutos");


    }



}
