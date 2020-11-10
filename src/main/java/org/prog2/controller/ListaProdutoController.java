package org.prog2.controller;

import org.prog2.model.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaProdutoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setDescricao("Produto 1");
       // produto1.setTipo("Eletronico");

        Produto produto2 = new Produto();
        produto2.setDescricao("Produto 2");
      //  produto2.setTipo("Eletronico");

        produtos.add(produto1);
        produtos.add(produto2);
        req.setAttribute("produtos", produtos);

        RequestDispatcher view = req.getRequestDispatcher("/view/produto/lista.jsp");
        view.forward(req, resp);
    }
}
