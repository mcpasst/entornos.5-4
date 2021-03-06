/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class testClientes {

    Cliente c = new Cliente("Mario", "Montoya", "Haya", "475274", "670382928", 27);

    Cuentas cuenta = new Cuentas(4444444, LocalDate.of(2010, 10, 20), 12000);

    /**
     * Metodo para hacer las comprobacion recuperar correctamete el valor nombre
     */
    @Test
    public void getNombre() {
        assertEquals("Mario", c.getNombre());
    }

    /**
     * Metodo para hacer las comprobacion de modificar el valor nombre
     */
    @Test
    public void setNombre() {
        c.setNombre("Juanfran");
        assertEquals("Juanfran", c.getNombre());
    }

    /**
     * Metodo para hacer las comprobacion recuperar correctamete el valor
     * apellido
     */
    @Test
    public void getApellido() {
        assertEquals("Montoya", c.getApellido());
    }

    /**
     * Metodo para hacer las comprobacion de modificar el valor apellido
     */
    @Test
    public void setApellido() {
        c.setApellido("Hoyas");
        assertEquals("Hoyas", c.getApellido());
    }

    /**
     * Metodo para hacer las comprobacion recuperar correctamete el valor
     * direccion
     */
    @Test
    public void getDireccion() {
        assertEquals("Haya", c.getDireccion());
    }

    /**
     * Metodo para hacer las comprobacion de modificar el valor direccion
     */
    @Test
    public void setDireccion() {
        c.setDireccion("Arces");
        assertEquals("Arces", c.getDireccion());
    }

    /**
     * Metodo para hacer las comprobacion recuperar correctamete el valor NIF
     */
    @Test
    public void getNif() {
        assertEquals("475274", c.getNif());
    }

    /**
     * Metodo para hacer las comprobacion de modificar el valor NIF
     */
    @Test
    public void setNif() {
        c.setNif("123456");
        assertEquals("123456", c.getNif());
    }

    /**
     * Metodo para hacer las comprobacion recuperar correctamete el valor
     * telefono
     */
    @Test
    public void getTelefono() {
        assertEquals("670382928", c.getTelefono());
    }

    /**
     * Metodo para hacer las comprobacion de modificar el valor telefono
     */
    @Test
    public void setTelefono() {
        c.setTelefono("666856522");
        assertEquals("666856522", c.getTelefono());
    }

    /**
     * Metodo para hacer las comprobacion recuperar correctamete el valor edad
     */
    @Test
    public void getEdad() {
        assertEquals(27, c.getEdad());
    }

    /**
     * Metodo para hacer las comprobacion de modificar el valor edad
     */
    @Test
    public void setEdad() {
        c.setEdad(20);
        assertEquals(20, c.getEdad());
    }

}
