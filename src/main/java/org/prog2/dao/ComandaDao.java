package org.prog2.dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.prog2.model.Cardapio;
import org.prog2.model.Comanda;


public class ComandaDao {


    public void inserirComanda(Comanda objComanda){

        getCollection().insertOne(objComanda);

    }

    public FindIterable<Comanda> getComanda(){
        return  getCollection().find();
    }

    private MongoCollection<Comanda> getCollection(){
        return config.DatabaseConnector.getDatabase().getCollection("comanda", Comanda.class);
    }

    public MongoCollection<Comanda> getCollections(){
        return config.DatabaseConnector.getDatabase().getCollection("comanda", Comanda.class);
    }


}
