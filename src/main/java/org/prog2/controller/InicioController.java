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

public class InicioController extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html;charset=UTF-8");

        List<Comanda> cardapios = new ArrayList<>();

        ComandaDao comandaDao = new ComandaDao();
        FindIterable<Comanda> comandas2 = comandaDao.getComanda();


        ObjectMapper objectMapper = new ObjectMapper();

        ProdutoDao produtoDao = new ProdutoDao();

        List<Comanda> coma = new ArrayList<>();

        AtomicReference<Double> f= new AtomicReference<>(0.0);

        AtomicReference<Double> faturamento = new AtomicReference<>(0.0);
        AtomicReference<Integer> quantidadepedidos = new AtomicReference<>(0);
        comandaDao.getCollections().find().forEach(a->{
            a.getItens().forEach(k->{
               f.set(f.get() + Double.parseDouble(k.getValototal()));
            });
            quantidadepedidos.set(quantidadepedidos.get() + 1);
        });

        System.out.println(quantidadepedidos);





        req.setAttribute("qntdpedidos", quantidadepedidos );

        req.setAttribute("faturamento", f );

        RequestDispatcher view = req.getRequestDispatcher("/view/inicio/index.jsp");

        view.forward(req, resp);
    }

}
