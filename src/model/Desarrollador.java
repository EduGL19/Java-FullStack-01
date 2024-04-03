package model;

import java.util.List;

public class Desarrollador extends Empleado {

    private List<String> Lenguaje;

    public void setLenguaje(List<String> lenguaje) {
        Lenguaje = lenguaje;
    }

    public List<String> getLenguaje() {
        return Lenguaje;
    }

}
