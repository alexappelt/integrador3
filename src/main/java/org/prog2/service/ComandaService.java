package org.prog2.service;

import com.mongodb.client.result.UpdateResult;
import org.bson.conversions.Bson;
import org.prog2.dao.CardapioDao;
import org.prog2.dao.ComandaDao;
import org.prog2.dao.FilialDao;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Cardapio;
import org.prog2.model.Comanda;
import org.prog2.model.Filial;
import org.prog2.model.Produto;

import java.util.List;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;


public class ComandaService {


    ProdutoDao prod = new ProdutoDao();
    ComandaDao card = new ComandaDao();


    public void atualizaestoqueitens(List<Produto> listprod){
        listprod.forEach(list->{

            System.out.println(list.getQuantidade());



            prod.getProduto().forEach(prodbd->{
                if (list.getCodigo().equals(prodbd.getCodigo())){
                    String qntdnova = Integer.toString(Integer.parseInt(prodbd.getQntdestoque()) - Integer.parseInt(list.getQuantidade()) ) ;
                    Bson filter = and(eq("codigo", list.getCodigo()));
                    Bson updateOperation = set("qntdestoque", qntdnova);
                    UpdateResult updateResult = prod.getCollections().updateOne(filter, updateOperation);
                    System.out.println("passou, alterou");
                    System.out.println(updateResult);
                }
                System.out.println(prodbd.getCodigo());

            });



            if(list.getStatus().equals("0")){
                list.setStatus("Pendente");
                list.setBootstrap("warning");
            }
            if(list.getStatus().equals("3")){
                list.setStatus("Pronto");
                list.setBootstrap("success");
            }
            if(list.getStatus().equals("1")){
                list.setStatus("Em preparo");
                list.setBootstrap("info");
            }

        });



    }


    public void inserirComanda(Comanda objComanda){

        ComandaDao comandaDao = new ComandaDao();

        comandaDao.inserirComanda(objComanda);


    }
}
