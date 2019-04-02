/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Ordi
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
   


    public static void main(String[] args) {
       
        Ville a;
        a= new Ville();
      
        Conteneur voiture = new Conteneur(0,0,0);
        Conteneur bloc = new Conteneur(2,0,0);
        
          
        
         voiture.tail(12);
         
          voiture.mettre(bloc,1);
        
          
          
  
            System.out.println(voiture.voirlecoffre()[1].toString());
            
        
 
        
        
        
  
    }

    
}