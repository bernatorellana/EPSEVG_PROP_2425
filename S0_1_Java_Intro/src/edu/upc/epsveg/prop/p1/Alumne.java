
package edu.upc.epsveg.prop.p1;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Alumne extends Persona {
    
    private int numMatricula;
    
    public Alumne(int numMatricula, String nom, Date dataNaixement, String NIF, boolean casat) {
        super(nom, dataNaixement, NIF, casat);
        this.numMatricula = numMatricula;
    }
    @Override
    public String getRol() {
        return "ALUMNE";
    }
}
