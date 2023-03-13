package interfazproyectotap;

import java.util.ArrayList;

public class Tarjeta {
    private  String numCuenta, numTarjeta;
    private Double limCredito, tasaInteresAnual, anualidad;
    private Fecha fechaCreacion, fechaCorte,  fechaPago, fechaApliAnua;
    ArrayList <Movimiento> repositorioDeMovimientos;
    
    public Tarjeta() {
        repositorioDeMovimientos = new ArrayList<Movimiento>();
    }

    public ArrayList<Movimiento> getRepositorioDeMovimientos() {
        return repositorioDeMovimientos;
    }

    public void setRepositorioDeMovimientos(ArrayList<Movimiento> repositorioDeMovimientos) {
        this.repositorioDeMovimientos = repositorioDeMovimientos;
    }
    
    public void addMovimiento(Movimiento m){
        repositorioDeMovimientos.add(m);
    }

    public Tarjeta(String numCuenta, String numTarjeta, Double limCredito, Double tasaInteresAnual, Double anualidad, Fecha fechaCreacion, Fecha fechaCorte, Fecha fechaPago, Fecha fechaApliAnua) {
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

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Fecha getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Fecha fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public Fecha getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Fecha fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Fecha getFechaApliAnua() {
        return fechaApliAnua;
    }

    public void setFechaApliAnua(Fecha fechaApliAnua) {
        this.fechaApliAnua = fechaApliAnua;
    }
    
    
}
