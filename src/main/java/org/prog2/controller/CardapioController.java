package org.prog2.controller;

import org.prog2.model.Cardapio;
import org.prog2.model.Filial;
import org.prog2.model.Produto;
import org.prog2.service.CardapioService;
import org.prog2.service.FilialService;
import org.prog2.service.ProdutoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CardapioController  extends HttpServlet {

    private CardapioService cardapioService = new CardapioService();



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/view/cardapio/index.jsp");
        view.forward(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Cardapio objCardapio = new Cardapio();


       System.out.println(req.getParameter("itens") );

        objCardapio.setItens(req.getParameter("itens"));

        objCardapio.setDescricao(req.getParameter("descricao"));



        cardapioService.inserirCardapio(objCardapio);

        //  resp.sendRedirect("/listarprodutos");


    }



}
