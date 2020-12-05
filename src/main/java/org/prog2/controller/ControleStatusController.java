package org.prog2.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.conversions.Bson;
import org.prog2.dao.ComandaDao;
import org.prog2.model.Comanda;
import org.prog2.model.Filial;
import org.prog2.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class ControleStatusController extends HttpServlet {





    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Comanda objComanda = new Comanda();

        List<Comanda> listacomanda = new ArrayList<>();

        String codigoitem = req.getParameter("item");
        String codigocomanda = req.getParameter("comanda");
        String codigostatus = req.getParameter("situacao");
        System.out.println(codigoitem);
        System.out.println(codigoitem.equals("7"));
        System.out.println(codigocomanda.equals("1"));
        System.out.println(codigostatus.equals("1"));


        List<Produto> listaproduto = new ArrayList<>();


        Produto product = new Produto();

        ComandaDao card = new ComandaDao();




        Bson filter = and(eq("codigo", codigocomanda), eq("itens.codigo", codigoitem));
        if(codigostatus.equals("0")){
            Bson updateOperation = set("itens.$.status", "Pendente");
            UpdateResult updateResult = card.getCollections().updateOne(filter, updateOperation);
            updateOperation = set("itens.$.bootstrap", "warning");
            card.getCollections().updateOne(filter, updateOperation);
        }
        if(codigostatus.equals("1")){
            Bson updateOperation = set("itens.$.status", "Em preparo");
            UpdateResult updateResult = card.getCollections().updateOne(filter, updateOperation);
            updateOperation = set("itens.$.bootstrap", "info");
            card.getCollections().updateOne(filter, updateOperation);
        }
        if(codigostatus.equals("3")){
            Bson updateOperation = set("itens.$.status", "Pronto");
            UpdateResult updateResult = card.getCollections().updateOne(filter, updateOperation);
            updateOperation = set("itens.$.bootstrap", "success");
            card.getCollections().updateOne(filter, updateOperation);
        }




        ObjectMapper objectMapper = new ObjectMapper();



    }


}
