package model;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private float salario;
    private float bono;


    /*public Empleado(int id, String nombre, String departamento, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getSalario() {
        return salario;
    }



}
