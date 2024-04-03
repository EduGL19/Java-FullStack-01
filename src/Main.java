import controller.DesarrolladorController;
import controller.GerenteController;
import daoImpl.DesarrolladorDaoImpl;
import daoImpl.GerenteDaoImpl;
import model.Desarrollador;
import model.Empleado;
import model.Gerente;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DesarrolladorController desarrolladorController = new DesarrolladorController(new DesarrolladorDaoImpl());

        Desarrollador desarrollador = new Desarrollador();
        desarrollador.setId(1);
        desarrollador.setNombre("Eduardo");
        desarrollador.setDepartamento("Lima");
        desarrollador.setSalario(2500);
        List<String> lenguajes = List.of("Javascript","Java","C#","SQL");
        desarrollador.setLenguaje(lenguajes);
        desarrolladorController.insert(desarrollador);


        Desarrollador desarrollador1 = new Desarrollador();
        desarrollador1.setId(2);
        desarrollador1.setNombre("Juan");
        desarrollador1.setDepartamento("Arequipa");
        desarrollador1.setSalario(3000);
        List<String> lenguajes1 = List.of("Sql","Java");
        desarrollador1.setLenguaje(lenguajes1);
        desarrolladorController.insert(desarrollador1);


        List<Desarrollador> desarrolladorList = new ArrayList<>();
        desarrolladorList = desarrolladorController.listDetail();


        for(Desarrollador model : desarrolladorList) {
            System.out.println(model.getId());
            System.out.println(model.getNombre());
            System.out.println(model.getDepartamento());
            System.out.println(model.getSalario());
            System.out.println(model.getLenguaje());

            String bono = desarrolladorController.evaluation(model.getId());
            System.out.println("Desempeño de Desarrollador: " + bono);
        };


        System.out.println(" ");
        //Registro de Gerente, Lista de Gerente y Evaluación
        GerenteController gerenteController = new GerenteController(new GerenteDaoImpl());

        Gerente gerente = new Gerente();
        gerente.setId(1);
        gerente.setNombre("Renzo");
        gerente.setDepartamento("Lima");
        gerente.setSalario(5000);
        List<String> equipos = List.of("Richard","Jose","Maria");
        gerente.setEquipo(equipos);
        gerenteController.insert(gerente);

        List<Gerente> gerenteList = new ArrayList<>();
        gerenteList = gerenteController.listDetail();


        for(Gerente model : gerenteList) {
            System.out.println(model.getId());
            System.out.println(model.getNombre());
            System.out.println(model.getDepartamento());
            System.out.println(model.getSalario());
            System.out.println(model.getEquipo());

            String bono = gerenteController.evaluation(model.getId());
            System.out.println("Desempeño de Gerente: " + bono);
        };





    }
}