package model;

import java.util.List;

public class Gerente extends Empleado {
    /*
    public Gerente(int id, String nombre, String departamento, float salario) {
        super(id, nombre, departamento, salario);
    }*/

    private List<String> Equipo;

    public List<String> getEquipo() {
        return Equipo;
    }

    public void setEquipo(List<String> equipo) {
        Equipo = equipo;
    }

}
