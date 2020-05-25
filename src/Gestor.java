
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mario
 */
public class Gestor {

    static Scanner sc = new Scanner(System.in);
    
    /**
     * Metodo Para modificar los atributos de un objeto Cliente
     *
     * @param  c es el objeto cliente a modificadr
     * @param opc es la opcion elegida para realizar
     * @param nombre es el nuevo valor del nombre
     * @param direc es la nueva direccion
     * @param ni es el nuevo NIF
     * @param telef es el nuevo telefono
     * 
     */
    public void modificarDatos(Cliente c, int opc, String nombre, String direc, String ni, String telef) {
        switch (opc) {
            case 1:
                System.out.println("Modificar nombre");
                String nombrenuevo = nombre;
                c.setNombre(nombrenuevo);
                break;
            case 2:
                System.out.println("Modificar direccion");
                String direccion = direc;
                c.setDireccion(direccion);
                break;
            case 3:
                System.out.println("Modificar NIF");
                String nif= ni;
                c.setNif(nif);
                break;
            case 4:
                System.out.println("Modificar Telefono");
                String telefono = telef;
                c.setTelefono(telefono);
                break;
        }

    }

}
