/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class testGestor {

    Cliente c = new Cliente("Mario", "Montoya", "Haya", "475274", "670382928", 27);
    Gestor g = new Gestor();
    
    @Test
    public void modificarDatos() {
        g.modificarDatos(c, 1, "Juan", "Arce", "888752", "666856585");
        assertEquals("Juan", c.getNombre());
        
        g.modificarDatos(c, 2, "Juan", "Arce", "888752", "666856585");
        assertEquals("Arce", c.getDireccion());
        
        g.modificarDatos(c, 3, "Juan", "Arce", "888752", "666856585");
        assertEquals("888752", c.getNif());
        
        g.modificarDatos(c, 4, "Juan", "Arce", "888752", "666856585");
        assertEquals("666856585", c.getTelefono());
    }
}
