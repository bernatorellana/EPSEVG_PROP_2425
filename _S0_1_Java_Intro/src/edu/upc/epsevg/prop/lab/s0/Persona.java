package edu.upc.epsevg.prop.lab.s0;


import java.util.Date;


/**
 *
 * @author Usuari
 */
public class Persona {
    private String nom;
    private String NIF;
    private Date dataNaixement;
    private boolean casat;

    public Persona(String nom, String NIF, Date dataNaixement, boolean casat) {
        setNom(nom);
        this.NIF = NIF;
        this.dataNaixement = dataNaixement;
        this.casat = casat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null || nom.trim().length()==0) throw new RuntimeException();
        this.nom = nom;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Date getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Date dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public boolean isCasat() {
        return casat;
    }

    public void setCasat(boolean casat) {
        this.casat = casat;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", NIF=" + NIF + ", dataNaixement=" + dataNaixement + ", casat=" + casat + '}';
    }
    
}
