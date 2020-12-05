package org.prog2.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.mongodb.client.FindIterable;
import com.mongodb.client.result.UpdateResult;
import org.bson.conversions.Bson;
import org.prog2.dao.CardapioDao;
import org.prog2.dao.ComandaDao;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Cardapio;
import org.prog2.model.Comanda;
import org.prog2.model.Filial;
import org.prog2.model.Produto;
import org.prog2.service.CardapioService;
import org.prog2.service.ComandaService;
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
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

import static com.mongodb.client.model.Updates.set;


public class ComandaController  extends HttpServlet {

    private ComandaService comandaService = new ComandaService();



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Produto> produtos = new ArrayList<>();

        ProdutoDao produtoDao = new ProdutoDao();
        FindIterable<Produto> products = produtoDao.getProduto();


        products.forEach(a -> {
            produtos.add(a);
        });




        req.setAttribute("produtos", produtos );

        RequestDispatcher view = req.getRequestDispatcher("/view/comanda/index.jsp");
        view.forward(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Comanda objComanda = new Comanda();
        List<Comanda> listacomanda = new ArrayList<>();
        List<Produto> listaproduto = new ArrayList<>();
        Produto product = new Produto();
        ProdutoDao prod = new ProdutoDao();
        ComandaDao card = new ComandaDao();
        List<Document> teste = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        List<Produto> listprod = objectMapper.readValue(req.getParameter("itens"), new TypeReference<List<Produto>>(){});

        comandaService.atualizaestoqueitens(listprod);
        objComanda.setItens(listprod);
        objComanda.setCodigo(req.getParameter("codigo"));
        comandaService.inserirComanda(objComanda);


    }



}
