package com.mycompany.exercicimapllibre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author bernat
 */
public class Book {

    private static Set<String> paraules = new TreeSet<>();
    private static Map<String, Integer> frequencies = new HashMap<>();

 
    public static void main(String[] args) {

        readAllLinesFromTheBook();
        
        showFrequencyReport();
        
        System.out.println("Al llibre hi ha "+paraules.size()+" paraules"); 
        for(String p: paraules){
            System.out.println(" + " + p);
        }
        
    }


    /**
     * Update the frequency counter with the words appearing in the line .
     * @param line contains the words that should be accounted.
     */
    private static void registerWordsInALine(String line) {
         System.out.println("*"+line);  
         String[] paraulesLinia = line.split("[ ,;\\.?¿()/-]");
         for(String p:paraulesLinia) {
             p = p.toLowerCase();
             p = p.replaceAll("[^a-zA-Z0-9]", "");
             if(!p.isEmpty()){
                paraules.add(p);
                //------------------             
                Integer i = frequencies.get(p);
                int recompte = 1;
                if(i!=null) {
                    recompte = i+1;
                }
                frequencies.put(p, recompte);
             }
         }
    }
    
    /**
     * Shows in stdout a list of words using the format:
     *    {word} - {frequency}
     * 
     * Words should appear sorted by descending frequency.
     */
    private static void showFrequencyReport(){

        System.out.println("     Frequency report");
        System.out.println("============================");
        
        /*for( Entry<String, Integer> tupla: frequencies.entrySet()){
            System.out.println(" * " + tupla.getKey()+":"+tupla.getValue());
        }*/
        
        //frequencies.entrySet() // el conjunt a ordenar
        List<Entry<String,Integer>> llistaEntrades = new ArrayList<>(); 
        llistaEntrades.addAll(frequencies.entrySet());
        Collections.sort(llistaEntrades,(o1, o2) -> o2.getValue()-o1.getValue());
        for( Entry<String, Integer> tupla: llistaEntrades){
            System.out.println(" * " + tupla.getKey()+":"+tupla.getValue());
        }
    }
    


    private static void readAllLinesFromTheBook() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "Dracula.txt"));
            String line = reader.readLine();
            while (line != null) {               
                // read next line
                registerWordsInALine(line);//xxxxxxxxx
                line = reader.readLine();
                
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    

}
