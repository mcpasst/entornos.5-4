
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
    private String nombre,apellido,direccion,nif,telefono;
    private int edad;
    private ArrayList<Cuentas>cuentas = new ArrayList<>();

    public Cliente(String nombre, String apellido, String direccion, String nif, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Cuentas> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void retirarDinero(double cantidad , int cuenta){
        if(this.cuentas.get(cuenta).getSaldo()-cantidad > 0){
            this.cuentas.get(cuenta).setSaldo(this.cuentas.get(cuenta).getSaldo()-cantidad);
        }else{
            System.out.println("No dispones de tanto dinero en esa cuenta");
        }
    }
    
    public void ingresarDinero(double cantidad , int cuenta){
          this.cuentas.get(cuenta).setSaldo(this.cuentas.get(cuenta).getSaldo()+cantidad);
    }
    
}
