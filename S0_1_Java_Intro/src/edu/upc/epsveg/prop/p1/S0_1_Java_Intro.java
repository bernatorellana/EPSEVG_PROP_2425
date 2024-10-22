package edu.upc.epsveg.prop.p1;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class S0_1_Java_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int o = 12;
        long id = 23123123l;
        float nomina = 123123.23f;
        boolean demaVinc = true;
        char lletra = 'C';
        String nom = "Paquito";
        String cognom ="Perez Sánchez";
        nom = nom + " "+ cognom;
        nom = nom.toUpperCase();
        System.out.println("nom:"+nom);
        String[] trocets = nom.split(" ");
        for(int i=0;i<trocets.length;i++){
            System.out.println(" * "+trocets[i]);    
        }
        StringBuffer c = new StringBuffer();
        for(int i=0;i<1000000;i++){
            c.append(i);
        }
        System.out.println(">"+c);
        //-----------------------------------------
        Date begin = new Date(); 
        float n=1;
        for(int i=0;i<1000000;i++){
          n*=0.1;
        } 
        Date end = new Date(); 
        System.out.println(end.getTime()- begin.getTime());
        //-----------------------------------------
        String hola="hola";
        String kk="soroll";
        String unAltreHola = "hol";
        unAltreHola +="a";
        if(hola.equals(unAltreHola)) {
            System.out.println("El món té sentit");
        } else {
            System.out.println("DEIXAR LA INFORMÀTICA I ANAR A PASTURAR CABRES");
        }
        
        //******************************************************************
        // Proves amb les classes
        //Persona p = new Persona("Paquito",new Date(), "11111111H", false);

        //System.out.println(">"+p);
        
        Persona[] llista = new Persona[10];
        llista[0]= new Profe("Paquito",new Date(), "11111111H", false);
        llista[1]= new Alumne(12, "Jaimito",new Date(), "22222222G", false);
        for( Persona per:llista){
            
            System.out.println("ROL:"+per.getRol());
            
            if(per instanceof Alumne){
                System.out.println(""+per);
            }
        }
        //Persona p1 = new Profe( "Jaimito",new Date(), "22222222G", false);
        //Alumne a = (Alumne)p1;
        
    }
    
}
