package controller;

import dao.GerenteDao;
import model.Desarrollador;
import model.Gerente;

import java.util.List;

public class GerenteController {

    private GerenteDao gerenteDao;

    public GerenteController(GerenteDao gerenteDao) {
        this.gerenteDao = gerenteDao;
    }

    public List<Gerente> listDetail(){
        return gerenteDao.listDetail();
    }

    public  void insert(Gerente gerente){
        gerenteDao.insert(gerente);
    }

    public String evaluation(int id){
        return gerenteDao.evaluation(id);
    }



}
