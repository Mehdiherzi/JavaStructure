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
      
         
        Conteneur voiture = new Conteneur(100,100,100,1);
         voiture.tail(12);
        int i;
   
          
        
        
              for ( i = 0; i < voiture.coffre.length; i++) {
               
        Conteneur  alpha= new Conteneur(4,4,4,i);
              if (i==2) {
                    voiture.mettre(null,i);  
                  }
              else
              voiture.mettre(alpha,i); 
              
        }

        
          i=0;
          
        do {
            if (voiture.voirlecoffre()[i]==null ) {
                
                System.out.println("emplacement "+i+ " vide" );
            }
            else{
                System.out.println(voiture.voirlecoffre()[i].toString());
            }
            
            
            i++;
        } while (i< voiture.coffre.length);
        

        
 
        
        
        
  
    }

    
}