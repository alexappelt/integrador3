package org.prog2.service;

import org.prog2.dao.FilialDao;
import org.prog2.model.Filial;


public class FilialService {

    public void inserirFilial(Filial objFilial){

        FilialDao filialDao = new FilialDao();

        filialDao.inserirFilial(objFilial);



    }
}
