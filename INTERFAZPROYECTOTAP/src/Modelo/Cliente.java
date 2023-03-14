package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String nombre, apPaterno, apMaterno, curp;
    private Fecha fechaNacimiento;
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
    

    public Cliente(String nombre, String apPaterno, String apMaterno, String curp, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente: " + "nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", curp=" + curp + ", fechaNacimiento=" + fechaNacimiento;
    }
    
    
}
