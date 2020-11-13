package org.prog2.service;

import org.prog2.dao.CardapioDao;
import org.prog2.model.Cardapio;

public class CardapioService {

    public void inserirCardapio(Cardapio objCardapio){

        CardapioDao cardapioDao = new CardapioDao();
        cardapioDao.inserirCardapio(objCardapio);
    }
}