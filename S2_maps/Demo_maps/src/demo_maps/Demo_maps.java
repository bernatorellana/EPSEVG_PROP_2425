package demo_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author Usuari
 */
public class Demo_maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer, String> jugadors  = new TreeMap<>();
        jugadors.put(33, "Joanet Pepet");
        jugadors.put(74, "Maria González");
        jugadors.put(22, "Pere Cruz");
        jugadors.put(74, "Mari Carmen");
        
        if(jugadors.containsKey(88)){ // Verificar l'existència d'una clau
            String nomDesconegut = jugadors.get(88);
        }                
        for(Integer numero:jugadors.keySet()){ // recorregut per claus
            String nom = jugadors.get(numero);
            System.out.println(numero+":"+nom);
        }
        for(String nom : jugadors.values()){ // recorregut per valors
            System.out.println( nom);
        }
        for( Entry<Integer,String> tupla: jugadors.entrySet()){ // recorregut per tuples
            System.out.println(tupla.getKey()+":"+tupla.getValue());
        }
        
        
    }
    
}
