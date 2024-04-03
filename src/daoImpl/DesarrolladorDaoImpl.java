package daoImpl;

import dao.DesarrolladorDao;
import model.Desarrollador;

import java.util.*;

public class DesarrolladorDaoImpl implements DesarrolladorDao {

    List<Desarrollador> desarrolladorList = new ArrayList<>();

    @Override
    public void insert(Desarrollador entity) {

        desarrolladorList.add(entity);

    }

    @Override
    public void update(Desarrollador entity) {

    }

    @Override
    public Optional<Desarrollador> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Desarrollador> listDetail() {
        return desarrolladorList;
    }

    @Override
    public String evaluation(Integer id) {

        Desarrollador desarrollador = desarrolladorList.stream()
                .filter(customer -> id.equals(customer.getId()))
                .findAny()
                .orElse(null);

        if (desarrollador.getLenguaje().size() > 3){
            return "BUENO";
        }else if (desarrollador.getLenguaje().size() >= 2 && desarrollador.getLenguaje().size() <= 3){
            return "REGULAR";
        } else {
            return "SIN BONO";
        }


    }


}
