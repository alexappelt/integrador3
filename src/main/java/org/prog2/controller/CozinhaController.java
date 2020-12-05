package org.prog2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.FindIterable;
import org.prog2.dao.CardapioDao;
import org.prog2.dao.ComandaDao;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Cardapio;
import org.prog2.model.Comanda;
import org.prog2.model.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class CozinhaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        List<Comanda> cardapios = new ArrayList<>();

        ComandaDao comandaDao = new ComandaDao();
        FindIterable<Comanda> comandas2 = comandaDao.getComanda();


        ObjectMapper objectMapper = new ObjectMapper();

        ProdutoDao produtoDao = new ProdutoDao();

        List<Comanda> coma = new ArrayList<>();




        comandaDao.getCollections().find().forEach(a->{
            coma.add(a);
        });

        coma.forEach(b->{
            System.out.println(b.getCodigo());
            b.getItens().forEach(c->{

                if(c.getStatus().equals("0")){
                    System.out.println("Status Pendente");
                    c.setStatus("Pendente");
                }
                if(c.getStatus().equals("1")){
                    System.out.println("Status Pronto");
                    c.setStatus("Pronto");
                }
                if(c.getStatus().equals("2")){
                    System.out.println("Status em Preparo");
                    c.setStatus("Em preparo");
                }

                if(c.getCozinha().equals("S")){
                    c.setCozinha("true");
                }

            });
        });




        req.setAttribute("cardapios", coma );


        RequestDispatcher view = req.getRequestDispatcher("/view/cozinha/lista.jsp");
        view.forward(req, resp);
    }
}
