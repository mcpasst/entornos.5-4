
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

    public void modificarDatos(Cliente c, int opc) {
        switch (opc) {
            case 1:
                System.out.println("Modificar nombre");
                String nombrenuevo = sc.nextLine();
                c.setNombre(nombrenuevo);
                break;
            case 2:
                System.out.println("Modificar direccion");
                String direccion = sc.nextLine();
                c.setDireccion(direccion);
                break;
            case 3:
                System.out.println("Modificar NIF");
                String nif= sc.nextLine();
                c.setNif(nif);
                break;
            case 4:
                System.out.println("Modificar Telefono");
                String telefono = sc.nextLine();
                c.setTelefono(telefono);
                break;
        }

    }

}
