
package edu.upc.epsevg.prop.lab.s0;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Alumne extends Persona{
    
    private int numMatricula;
    
    public Alumne(int numMatricula, String nom, String NIF, Date dataNaixement, boolean casat) {
        super(nom, NIF, dataNaixement, casat);
        this.numMatricula = numMatricula;
    }
    
}
