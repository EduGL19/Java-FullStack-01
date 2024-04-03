package daoImpl;

import dao.GerenteDao;
import model.Desarrollador;
import model.Gerente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GerenteDaoImpl implements GerenteDao {

    List<Gerente> gerenteList = new ArrayList<>();

    @Override
    public void insert(Gerente entity) {

        gerenteList.add(entity);

    }

    @Override
    public void update(Gerente entity) {

    }

    @Override
    public Optional<Gerente> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Gerente> listDetail() {
        return gerenteList;
    }

    @Override
    public String evaluation(Integer id) {

        Gerente gerente = gerenteList.stream()
                .filter(customer -> id.equals(customer.getId()))
                .findAny()
                .orElse(null);

        if (gerente.getEquipo().size() > 3){
            return "BUENO";
        }else if (gerente.getEquipo().size() >= 2 && gerente.getEquipo().size() <= 3){
            return "REGULAR";
        } else {
            return "SIN BONO";
        }

    }


}
