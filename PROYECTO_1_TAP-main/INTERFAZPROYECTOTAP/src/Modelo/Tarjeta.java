package Modelo;

import Modelo.Movimiento;
import java.util.ArrayList;
import java.util.Date;

public class Tarjeta {

    private String numCuenta, numTarjeta;
    private Double limCredito, tasaInteresAnual, anualidad;
    private Date fechaCreacion, fechaCorte, fechaPago, fechaApliAnua;
    ArrayList<Movimiento> repositorioDeMovimientos;

    public Tarjeta() {
        repositorioDeMovimientos = new ArrayList<Movimiento>();
    }

//Lista de movimientos
    public ArrayList<Movimiento> getRepositorioDeMovimientos() {
        return repositorioDeMovimientos;
    }

    public void setRepositorioDeMovimientos(ArrayList<Movimiento> repositorioDeMovimientos) {
        this.repositorioDeMovimientos = repositorioDeMovimientos;
    }

    public void addMovimiento(Movimiento m) {
        repositorioDeMovimientos.add(m);
    }

    //Atributos de la clase
    public Tarjeta(String numCuenta, String numTarjeta, Double limCredito, Double tasaInteresAnual, Double anualidad, Date fechaCreacion, Date fechaCorte, Date fechaPago, Date fechaApliAnua) {
        this.numCuenta = numCuenta;
        this.numTarjeta = numTarjeta;
        this.limCredito = limCredito;
        this.tasaInteresAnual = tasaInteresAnual;
        this.anualidad = anualidad;
        this.fechaCreacion = fechaCreacion;
        this.fechaCorte = fechaCorte;
        this.fechaPago = fechaPago;
        this.fechaApliAnua = fechaApliAnua;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Double getLimCredito() {
        return limCredito;
    }

    public void setLimCredito(Double limCredito) {
        this.limCredito = limCredito;
    }

    public Double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(Double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public Double getAnualidad() {
        return anualidad;
    }

    public void setAnualidad(Double anualidad) {
        this.anualidad = anualidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaApliAnua() {
        return fechaApliAnua;
    }

    public void setFechaApliAnua(Date fechaApliAnua) {
        this.fechaApliAnua = fechaApliAnua;
    }

    @Override
    public String toString() {
        return "Numero de Cuenta: " + numCuenta + "\n"
                + "Numero de Tarjeta: " + numTarjeta + "\n"
                + "Limite de Credito: " + limCredito + "\n"
                + "Tasa de Interes Anual: " + tasaInteresAnual + "\n"
                + "Anualidad: " + anualidad + "\n"
                + "Aplicacion de Anualidad: " + fechaApliAnua + "\n"
                + "Fecha de Creacion: " + fechaCreacion + "\n"
                + "Fecha de Corte: " + fechaCorte + "\n"
                + "Fecha de Pago: " + fechaPago;
    }
}
