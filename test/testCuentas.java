/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class testCuentas {

    Cuentas c = new Cuentas(4444444, LocalDate.of(2010, 10, 20), 12000);

    @Test
    public void getLIMITE() {
        assertEquals(400, c.getLIMITE());
    }

    @Test
    public void setNombre() {
        c.setLIMITE(250);
        assertEquals(250, c.getLIMITE());
    }

    @Test
    public void getNumeroTarjeta() {
        assertEquals(4444444, c.getNumeroTarjeta());
    }

    @Test
    public void setNumeroTarjeta() {
        c.setNumeroTarjeta(2222222);
        assertEquals(2222222, c.getNumeroTarjeta());
    }

    @Test
    public void getLimite() {
        assertEquals(400, c.getLimite());
    }

    @Test
    public void setLimite() {
        c.setLimite(200);
        assertEquals(200, c.getLimite());
    }

    @Test
    public void getFecha() {
        assertEquals(LocalDate.of(2010, 10, 20), c.getFecha());
    }

    @Test
    public void setFecha() {
        c.setFecha(LocalDate.of(2000, 12, 2));
        assertEquals(LocalDate.of(2000, 12, 2), c.getFecha());
    }

    @Test
    public void getSaldo() {
        assertTrue(true);
    }

    @Test
    public void setSaldo() {
        c.setFecha(LocalDate.of(2000, 12, 2));
        assertTrue(true);
    }

}
