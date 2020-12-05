package org.prog2.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.mongodb.client.FindIterable;
import org.prog2.dao.CardapioDao;
import org.prog2.dao.ProdutoDao;
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
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class CardapioController  extends HttpServlet {

    private CardapioService cardapioService = new CardapioService();



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Produto> produtos = new ArrayList<>();

        ProdutoDao produtoDao = new ProdutoDao();
        FindIterable<Produto> products = produtoDao.getProduto();


        products.forEach(a -> {
            produtos.add(a);
        });




        req.setAttribute("produtos", produtos );

        RequestDispatcher view = req.getRequestDispatcher("/view/cardapio/index.jsp");
        view.forward(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Cardapio objCardapio = new Cardapio();

        List<Cardapio> listacardapio = new ArrayList<>();



        List<Produto> listaproduto = new ArrayList<>();

        Produto product = new Produto();

        CardapioDao card = new CardapioDao();

        List<Document> teste = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();


        List<Produto> listprod = objectMapper.readValue(req.getParameter("itens"), new TypeReference<List<Produto>>(){});

        System.out.println("teste");
        listprod.forEach(k->{
           System.out.println(k.getDescricao());
        });


        objCardapio.setItens(listprod);
        objCardapio.setDescricao(req.getParameter("descricao"));








        cardapioService.inserirCardapio(objCardapio);



        //  resp.sendRedirect("/listarprodutos");


    }



}
