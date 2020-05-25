
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class Cuentas {
    private int LIMITE = 400;
    private int numeroTarjeta;
    private int limite;
    private LocalDate fecha;
    private double saldo;

    public Cuentas(int numeroTarjeta,  LocalDate fecha, double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.limite = this.LIMITE;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public int getLIMITE() {
        return LIMITE;
    }

    public void setLIMITE(int LIMITE) {
        this.LIMITE = LIMITE;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
            
    
}
