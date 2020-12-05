package org.prog2.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.FindIterable;
import org.prog2.dao.CardapioDao;
import org.prog2.dao.FilialDao;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Cardapio;
import org.prog2.model.Filial;
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




public class ListarCardapioController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        List<Cardapio> cardapios = new ArrayList<>();

        CardapioDao cardapioDao = new CardapioDao();
        FindIterable<Cardapio> cardapios2 = cardapioDao.getCardapio();


        ObjectMapper objectMapper = new ObjectMapper();

        ProdutoDao produtoDao = new ProdutoDao();

        List<Cardapio> carda = new ArrayList<>();


        cardapioDao.getCollections().find().forEach(a->{
            carda.add(a);
        });

        carda.forEach(b->{
            System.out.println(b.getDescricao());
            b.getItens().forEach(c->{
                System.out.println(c.getDescricao());
            });
        });




        req.setAttribute("cardapios", carda );


        RequestDispatcher view = req.getRequestDispatcher("/view/cardapio/lista.jsp");
        view.forward(req, resp);


    }
}
