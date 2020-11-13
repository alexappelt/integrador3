package org.prog2.controller;

import com.mongodb.client.FindIterable;
import org.prog2.dao.CardapioDao;
import org.prog2.model.Cardapio;

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

        List<Cardapio> cardapios = new ArrayList<>();
        CardapioDao cardapioDao = new CardapioDao();
        FindIterable<Cardapio> cardapios2 = cardapioDao.getCardapio();

        cardapios2.forEach(a -> {
            cardapios.add(a);
        });

        req.setAttribute("cardapios", cardapios);

        RequestDispatcher view = req.getRequestDispatcher("/view/cardapio/lista.jsp");
        view.forward(req, resp);
    }
}