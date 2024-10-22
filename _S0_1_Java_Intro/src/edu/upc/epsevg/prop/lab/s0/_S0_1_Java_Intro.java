package edu.upc.epsevg.prop.lab.s0;

import java.util.Date;


public class _S0_1_Java_Intro {


    public static void main(String[] args) {
        System.out.println("Hello world");
        // ====================================
        // Declaració de variables
        int i  = 0;
        long ln = 23;
        float f = 34.34f;
        boolean heArribat = true;
        char lletra = 'A';
        String paraula = "Gat";
        paraula = paraula + " i gos";
        //paraula = paraula.toUpperCase();
        System.out.println(">"+paraula);
        System.out.println(">"+paraula.toUpperCase());
        System.out.println(">"+paraula);
        //           0123456
        String ip = "192.168.45.12";
        String primerOctet = ip.substring(0, ip.indexOf('.'));
        System.out.println("Primer Octet:"+primerOctet);
        
        String[] octets = ip.split("\\.");
        
        System.out.println("Primer Octet:"+octets[0]);
        
        
        // Experiment de rendiment
        //String resultat = "";
        StringBuffer resultat = new StringBuffer();
        Date abans = new Date();
        for(int n=0;n<1000000;n++){
            resultat.append(n);
        }
        Date despres = new Date();
        System.out.println("Resultat:"+resultat);
        long tempsMs = despres.getTime()-abans.getTime();
        System.out.println("Temps en ms:"+tempsMs);
        
        //Dates i hores
        Date data = new Date();
        System.out.println("Ara són les:"+data);
    
        ///====================================
        // proves amb Persona
        Persona maria = new Persona("Maria","11111111H",new Date(),false);
        Persona pep = new Persona("Pep","11111111H",new Date(),false);
        maria.setNom( "Maria2" );
        System.out.println(">"+maria.getNom());
        
        Persona[] gent = new Persona[10];
        gent[0] = new Alumne(12,"Paco", "1111111H", new Date(), false); 
        gent[1] = new Profe("Manel", "2222222H", new Date(), true);
        
        for(Persona p:gent) {
            System.out.println(">"+p);
        }
        
    }
    
}
