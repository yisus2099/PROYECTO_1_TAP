package Modelo;

import java.util.Date;

public class Movimiento {
   private  int clave;
   private Date fechaMovimiento;
   private byte tipoMovimiento;
   private double cantidad;
   

    public Movimiento() {
    }

    public Movimiento(int clave, Date fechaMovimiento, byte tipoMovimiento, double cantidad) {
        this.clave = clave;
        this.fechaMovimiento = fechaMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
    }

    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }
    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public byte getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(byte tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "clave=" + clave + ", fechaMovimiento=" + fechaMovimiento + ", tipoMovimiento=" + tipoMovimiento + ", cantidad=" + cantidad + '}';
    }
    
    
}
