package edu.upc.prop.lab.s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author bernat
 */
public class Programa {
    
    
    public static void main(String[] args) {
        
        //----------------------------------------------------------------------
        
        System.out.println("Hello world!");
        
        //----------------------------------------------------------------------
        
        Gos gos1 = new Gos(1, "Charly",6, "Bulldog", false);        
        Gos gos2 = new Gos(2, "Rivel",7, "Pitbull", true);        
        Gos gos3 = new Gos(3, "Rivel",7, "Pitbull", true);        
        Gat gat1 = new Gat(4, "Boira", 2, "Siamés", false);
        Gat gat2 = new Gat(5, "Xipi", 13, "Maltès", true);
        Gat gat3 = new Gat(6, "Nipi", 3, "Korea", true);
        
        //----------------------------------------------------------------------
        
        Propietari p1 = new Propietari("11111111H", "Paco");
        Propietari p2 = new Propietari("22222222H", "Marta");
        Propietari p3 = new Propietari("33333333H", "Cristina");
        Propietari p4 = new Propietari("44444444H", "Pep");
        Propietari p5 = new Propietari("55555555H", "Josep");
        Propietari p6 = new Propietari("66666666H", "Pepa");
              
        //----------------------------------------------------------------------
        
        // Exemples d'ús de Llistes
        
        List<Mascota> mascotes = new LinkedList<>();
        mascotes.add(gat1);
        mascotes.add(gat2);
        mascotes.add(gat3);
        mascotes.add(gos1);
        
        //mascotes.remove(gat3);
        mascotes.remove(2);
        
        
        for(int i=0;i<mascotes.size();i++){
            System.out.println(" > "+mascotes.get(i));
        }
        
        int indexDelGos = mascotes.indexOf(gos1);
        System.out.println("> index del gos:"+indexDelGos);
        
        Gos gos1_clone = new Gos(1, "Charly",6, "Bulldog", false); 
        indexDelGos = mascotes.indexOf(gos1_clone);
        System.out.println("> index del gos clònic:"+indexDelGos);
        //=========================================
        List<Mascota> experiments = new ArrayList<>();
        experiments.add(gat1); //Boira
        experiments.add(gat2); // Xipi
        experiments.add(gat1); //Boira
        
        
        experiments.get(0).setNom("XXXX");
        
        System.out.println("> " + experiments.get(0).getNom());
        System.out.println("> " + experiments.get(2).getNom());
        
        
        // ====================================================        
        // ====================================================
        System.out.println("========================================");
        System.out.println("= Exemples amb Set");
        Set<Mascota> conjunt = new TreeSet<>();
        conjunt.add(gat2);
        conjunt.add(gat2);
        conjunt.add(gat1);
        for(Mascota m:conjunt){
            System.out.println(">" + m);
        }
        // =======================================================0
        // Experiment d'ordenació
        System.out.println("===========================================");
        System.out.println("= Exemples d'ordenació");

        List<Mascota> mascotesDesordenades = new LinkedList<>();
        mascotesDesordenades.add(gat1);
        mascotesDesordenades.add(gat2);
        mascotesDesordenades.add(gat3);
        mascotesDesordenades.add(gos1);
        mascotesDesordenades.add(gos2);
        mascotesDesordenades.add(gos3);
        //Collections.sort(mascotesDesordenades); // Ordre natural, definit per compareTo
        Collections.sort(mascotesDesordenades,(o1, o2) -> o1.getEdat()-o2.getEdat());
        Collections.sort(mascotesDesordenades,(o1, o2) -> o1.getNom().compareTo(o2.getNom()));
        for(Mascota m:mascotesDesordenades){
            System.out.println(">" + m);
        }
    }
    
}
