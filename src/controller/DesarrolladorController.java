package controller;

import dao.DesarrolladorDao;
import model.Desarrollador;
import model.Empleado;
import model.Gerente;

import java.util.List;

public class DesarrolladorController {

    private DesarrolladorDao desarrolladorDao;

    public DesarrolladorController(DesarrolladorDao desarrolladorDao) {
        this.desarrolladorDao = desarrolladorDao;
    }

    public List<Desarrollador> listDetail(){
       return desarrolladorDao.listDetail();
    }

    public  void insert(Desarrollador desarrollador){
        desarrolladorDao.insert(desarrollador);
    }

    public String evaluation(int id){
        return desarrolladorDao.evaluation(id);
    }

}
