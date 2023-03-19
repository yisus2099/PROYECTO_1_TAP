package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {

    private String curp;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    ArrayList<Tarjeta> repositorioDeTarjetas;

    //Tarjeta
    public Cliente() {
        repositorioDeTarjetas = new ArrayList<Tarjeta>();
    }

    public void addTrjeta(Tarjeta t) {
        repositorioDeTarjetas.add(t);
    }

    public ArrayList<Tarjeta> getRepositorioDeTarjetas() {
        return repositorioDeTarjetas;
    }

    public void setRepositorioDeTarjetas(ArrayList<Tarjeta> repositorioDeTarjetas) {
        this.repositorioDeTarjetas = repositorioDeTarjetas;
    }

    //Atributos de la calse
    public Cliente(String curp, String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente:"+ "\n"
                 + "curp= " + curp + "\n"
                + "nombre= " + nombre + "\n"
                 + "Apellido Paterno= " + apellidoPaterno + "\n"
                + "Apellido Materno=" + apellidoMaterno + "\n"
                + "Fecha Nacimiento=" + fechaNacimiento;
    }
}
