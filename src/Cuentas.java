
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

    /*
     * Metodo constructor de objetos de tipo Cuentas
     *
     * @param numeroTarjeta, es la tarjeta asociada a la cuenta
     * @param fecha, es el dia que se creo dicha cuenta.
     * @param saldo es el dinero del que dispone la cuenta del cliente.
     */
    public Cuentas(int numeroTarjeta, LocalDate fecha, double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.limite = this.LIMITE;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    /**
     * Metodo getter del Limite de retirada del Cliente.
     *
     * @return Nombre del Cliente.
     */
    public int getLIMITE() {
        return LIMITE;
    }

    /**
     * Metodo setter del nombre del Cliente.
     *
     * @param LIMITE Nuevo limite maxi para poder gastar.
     */
    public void setLIMITE(int LIMITE) {
        this.LIMITE = LIMITE;
    }

    /**
     * Metodo getter del Numero de la tarjeta asociada a la cuenta.
     *
     * @return numeroTarjeta de la cuenta
     */
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Metodo setter del nombre del Cliente.
     *
     * @param numeroTarjeta Nuevo numero para la tarjeta de credito.
     */
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Metodo getter de la fecha que se hizo la cuenta.
     *
     * @return fecha de creacion de la cuenta
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Metodo setter de Fecha del Cliente.
     *
     * @param fecha Nueva fecha para la creacion de la cuenta
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo getter del saldo que dispone la cuenta.
     *
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo setter de Fecha del Cliente.
     *
     * @param saldo Nueva para modificar el saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
