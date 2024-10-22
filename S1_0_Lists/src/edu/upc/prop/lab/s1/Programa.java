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
        Gos gos3 = new Gos(3, "Alfredo",7, "Pitbull", true);        
        Gat gat1 = new Gat(4, "Boira", 2, "Siamés", false);
        Gat gat2 = new Gat(5, "Xipi", 13, "Maltès", true);
        Gat gat3 = new Gat(6, "Nipi", 3, "Korea", true);
        
        //----------------------------------------------------------------------
        
        // Proves amb llistes : ArrayList i LinkedList
        List<Mascota> mascotes = new LinkedList<>();
        mascotes.add(gos1);
        mascotes.add(gos2);
        mascotes.add(gos3);
        mascotes.add(gat1);
        mascotes.add(gat2);
        mascotes.add(gat3);
        
        Collections.sort(mascotes); // Ordre natural dels objectes
        
        Collections.sort(mascotes,(o1, o2) -> {
            return o1.getRaca().compareTo(o2.getRaca());
        });
        // Vull afegir el gos1 només si no existeix
        Gos gos1_clone = new Gos(1, "Charly",6, "Bulldog", false);  
        
        
        if(!mascotes.contains(gos1_clone)){
            mascotes.add(gos1_clone);
        }
        
               
        mascotes.remove(gos1);
        mascotes.remove(0);       
        
        for(int i=0;i<mascotes.size();i++){
            System.out.println(" > "+ mascotes.get(i));
        }
 
        //=========================================
        // Proves amb Sets
        System.out.println("//=========================================");
        System.out.println("Proves amb sets");
        Set<Mascota> conjunt = new TreeSet<>();
        conjunt.add(gos2);
        conjunt.add(gos1);
        conjunt.add(gos3);
        if(conjunt.contains(gos1_clone)){
            System.out.println("Ja el tinc !");
        }
        for( Mascota m :conjunt){
            System.out.println(" > " + m);
        }
        
        
        /*
        Propietari p1 = new Propietari("11111111H", "Paco");
        Propietari p2 = new Propietari("22222222H", "Marta");
        Propietari p3 = new Propietari("33333333H", "Cristina");
        Propietari p4 = new Propietari("44444444H", "Pep");
        Propietari p5 = new Propietari("55555555H", "Josep");
        Propietari p6 = new Propietari("66666666H", "Pepa");
              */
        //----------------------------------------------------------------------
    }
    
}
