package org.prog2.dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.prog2.model.Cardapio;


public class CardapioDao {


    public void inserirCardapio(Cardapio objCardapio){

        getCollection().insertOne(objCardapio);

    }

    public FindIterable<Cardapio> getCardapio(){
        return  getCollection().find();
    }

    private MongoCollection<Cardapio> getCollection(){
        return config.DatabaseConnector.getDatabase().getCollection("cardapio", Cardapio.class);
    }



}
