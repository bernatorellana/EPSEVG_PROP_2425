package edu.upc.epsevg.prop;

import edu.uci.ics.jung.graph.DelegateTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Bernat
 */
public class Main {


    public static void main(String[] args) {
        
        // puzzle amb solució de 5 moviments
        NinePuzzle start = new NinePuzzle(new int[]{1, 2, 3,
                                                    4, 5, 0,
                                                    6, 7, 8});

        NinePuzzle goal = new NinePuzzle(new int[]{ 1, 3, 5,
                                                    4, 2, 8,
                                                    6, 7, 0});
        start.setSolucio(goal);
        // puzzle amb solució de 31 moviments
        /*
        NinePuzzle start = new NinePuzzle(new int[]{    8, 6, 7, 
                                                        2, 5, 4, 
                                                        3, 0, 1}); 
        NinePuzzle goal = new NinePuzzle(new int[]{     1, 2, 3, 
                                                        4, 5, 6, 
                                                        7, 8, 0});
         */
        
        // Executem la cerca
        ResultatCerca rc = cercaNoInformadaIDS(start, goal, 20);
        // Mostra el resultat gràficament
        Visualizacio.showResultatCerca(rc);
    }

    /**
     * Implementació de BFS (Breadth-first Search) (@TODO: A implementar)
     * 
     * @param start node origen
     * @param goal node destí o solució
     * @param max_depth profunditat màxima permesa
     * @return el resultat de la cerca o null si no ha trobat resultat.
     */
    private static ResultatCerca cercaNoInformadaBFS(NinePuzzle start, NinePuzzle goal, int max_depth) {
        
        //----------------------------------- CODI D'EXEMPLE A ESBORRAR --------------------------------
        // Creació inicial del graf
        DelegateTree<NinePuzzle, Integer> g = new DelegateTree<>();
        // afegim el node arrel
        g.addVertex(start);
        
        List<NinePuzzle> LNO = new LinkedList<>();
        LNO.add(start);
        Integer id = 0;
        while(LNO.size()>0){
            NinePuzzle NA = LNO.remove(0);
            if(NA.comparaEstat(goal)){
                return new ResultatCerca(g, NA);
            } else {
                for(Dir d: NA.validMoves()){
                    NinePuzzle F = new NinePuzzle(NA);
                    F.move(d);
                    if(!esCicle(F, NA, g)){
                        LNO.add(F);
                        g.addChild(id++, NA, F);
                    }
                }
            }         
        }
        return null;
     
    }
    /**
     * Implementació de DFS (Depth-First Search) (@TODO: A implementar)
     * 
     * @param start node origen
     * @param goal node destí o solució
     * @param max_depth profunditat màxima permesa
     * @return el resultat de la cerca o null si no ha trobat resultat.
     */
    private static ResultatCerca cercaNoInformadaDFS(NinePuzzle start, NinePuzzle goal, int max_depth) {
 
        //----------------------------------- CODI D'EXEMPLE A ESBORRAR --------------------------------
        // Creació inicial del graf
        DelegateTree<NinePuzzle, Integer> g = new DelegateTree<>();
        // afegim el node arrel
        g.addVertex(start);
        
        LinkedList<NinePuzzle> LNO = new LinkedList<>();
        LNO.add(start);
        Integer id = 0;
        while(LNO.size()>0){
            NinePuzzle NA = LNO.remove(0);
            if(NA.getDepth()<=max_depth) {
                if(NA.comparaEstat(goal)){
                    return new ResultatCerca(g, NA);
                } else {
                    for(Dir d: NA.validMoves()){
                        NinePuzzle F = new NinePuzzle(NA);
                        F.move(d);
                        if(!esCicle(F, NA, g)){
                            LNO.addFirst(F);
                            g.addChild(id++, NA, F);
                        }
                    }
                }  
            }
        }
        return null;
    }
    /**
     * Implementació de IDS (Iterative Deepening depth-first Search) (@TODO: A implementar)
     * 
     * @param start node origen
     * @param goal node destí o solució
     * @param max_depth profunditat màxima permesa
     * @return el resultat de la cerca o null si no ha trobat resultat.
     */
    private static ResultatCerca cercaNoInformadaIDS(NinePuzzle start, NinePuzzle goal, int max_depth) {
       
        for(int i=1;i<max_depth;i++){
            ResultatCerca rc = cercaNoInformadaDFS(start, goal, i);
            if(rc!=null) return rc;
        }
        return null;
        
    }

    private static boolean esCicle(NinePuzzle F, NinePuzzle NA, DelegateTree<NinePuzzle, Integer> g) {

        NinePuzzle parent = g.getParent(NA);
        
        while(parent!=null){
             if(parent.comparaEstat(F)) return true;
             parent = g.getParent(parent);// Pugem per l'arbre
        }
        return false;
    }
 

    
    

}
