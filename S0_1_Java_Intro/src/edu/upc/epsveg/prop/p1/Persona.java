package edu.upc.epsveg.prop.p1;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public abstract class Persona {

    private String nom;
    private Date dataNaixement;
    private String NIF;
    private boolean casat;
    
    public Persona(String nom, Date dataNaixement, String NIF, boolean casat) {

        setNom(nom);
        this.dataNaixement = dataNaixement;
        this.NIF = NIF;
        this.casat = casat;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null || nom.trim().length()==0) throw new RuntimeException();
        this.nom = nom;
    }

    public Date getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Date dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public boolean isCasat() {
        return casat;
    }

    public void setCasat(boolean casat) {
        this.casat = casat;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", dataNaixement=" + dataNaixement + ", NIF=" + NIF + ", casat=" + casat + '}';
    }
    
    
    public abstract String getRol();
    
    
    
}
