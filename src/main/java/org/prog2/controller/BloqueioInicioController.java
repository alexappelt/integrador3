package org.prog2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.FindIterable;
import org.prog2.dao.ComandaDao;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Comanda;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class BloqueioInicioController extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html;charset=UTF-8");







        RequestDispatcher view = req.getRequestDispatcher("/view/bloqueio/bloqueio.jsp");

        view.forward(req, resp);
    }

}
