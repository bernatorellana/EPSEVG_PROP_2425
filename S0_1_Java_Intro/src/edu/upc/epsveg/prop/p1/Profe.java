
package edu.upc.epsveg.prop.p1;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Profe extends Persona{
    
    public Profe(String nom, Date dataNaixement, String NIF, boolean casat) {
        super(nom, dataNaixement, NIF, casat);
    }

    @Override
    public String getRol() {
        return "PROFE";
    }
    
}
