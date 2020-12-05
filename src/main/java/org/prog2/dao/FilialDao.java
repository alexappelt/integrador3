package org.prog2.dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.prog2.model.Filial;


public class FilialDao {


    public void inserirFilial(Filial objFilial){

        getCollection().insertOne(objFilial);

    }

    public FindIterable<Filial> getFilial(){
        return  getCollection().find();
    }

    private MongoCollection<Filial> getCollection(){
        return config.DatabaseConnector.getDatabase().getCollection("filial", Filial.class);
    }



}
