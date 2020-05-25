
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mario
 */
public class Cliente {

    //att
    private String nombre, apellido, direccion, nif, telefono;
    private int edad;
    private ArrayList<Cuentas> cuentas = new ArrayList<>();

    /*
     * Metodo constructor de objetos de tipo Cliente.
     *
     * 
     * @param name Nombre del cliente.
     * @param apellido es Primer apellido del cliente.
     * @param direction es direccion del cliente.
     * @param nif DNI del cliente.
     * @param telefono es numero de telefono del cliente.
     * @param edad es la Edad del cliente.
     */
    public Cliente(String nombre, String apellido, String direccion, String nif, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * Metodo getter del nombrel del Cliente.
     *
     * @return Nombre del Cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter del nombre del Cliente.
     *
     * @param nombre Nuevo nombre del Cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getter del apellido del Cliente.
     *
     * @return Apellido del Cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo setter del apellido del Cliente.
     *
     * @param apellido Nuevo apellido del Cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo getter de la direccion del Cliente.
     *
     * @return direccion del Cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo setter de la direccion del Cliente.
     *
     * @param direccion Nueva direccion del Cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo getter del DNI del Cliente.
     *
     * @return nif, DNI del Cliente.
     */
    public String getNif() {
        return nif;
    }

    /**
     * Metodo setter del nif del Cliente.
     *
     * @param nif Nueva DNI del Cliente.
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Metodo getter del TELEFONO del Cliente.
     *
     * @return telefono del Cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo setter del telefono del Cliente.
     *
     * @param telefono Nuevo telefono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo getter de la edad del Cliente.
     *
     * @return edad del Cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo setter de la edad del Cliente.
     *
     * @param edad Nueva del cliente
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo getter de las cuentas Cliente.
     *
     * @return cuentas del Cliente.
     */
    public ArrayList<Cuentas> getCuentas() {
        return cuentas;
    }

    /**
     * Metodo setter de las cuentas del Cliente.
     *
     * @param cuentas Nueva cuentas del cliente
     */
    public void setCuentas(ArrayList<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Metodo Para retirar dinero de la cuenta elegida por el cliente.
     *
     * @param cantidad es el dinero a retirar
     * @param cuenta es la cuenta elegida por el usuario para la operacion.
     */
    public void retirarDinero(double cantidad, int cuenta) {
        if (this.cuentas.get(cuenta).getSaldo() - cantidad > 0) {
            this.cuentas.get(cuenta).setSaldo(this.cuentas.get(cuenta).getSaldo() - cantidad);
        } else {
            System.out.println("No dispones de tanto dinero en esa cuenta");
        }
    }

    /**
     * Metodo Para ingresar dinero de la cuenta elegida por el cliente.
     *
     * @param cantidad es el dinero a retirar
     * @param cuenta es la cuenta elegida por el usuario para la operacion.
     */
    public void ingresarDinero(double cantidad, int cuenta) {
        this.cuentas.get(cuenta).setSaldo(this.cuentas.get(cuenta).getSaldo() + cantidad);
    }

    /**
     * Metodo Para retirar dinero de la cuenta elegida por el cliente.
     */
    public void verSaldo() {
        for (int i = 0; i < this.cuentas.size(); i++) {
            System.out.println(this.cuentas.get(i));
        }
    }

}
