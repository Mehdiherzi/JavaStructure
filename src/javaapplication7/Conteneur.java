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
public class Conteneur {
    
    
        private float largueur;
        private float longueur;
        private float profondeur;
        private int   taille; 
        
        public Conteneur coffre [] = new  Conteneur[taille];     
        
        
        public Conteneur(float largueur ,float longueur,float profondeur ){
          float a = 0f;
         this.largueur = largueur;  
         this.longueur= longueur; 
         this.profondeur = profondeur;
         
     
        }
        
        
          public   String  toString()
        {
            String a= " largueur " + largueur+ " longueur "+longueur+" profondeur "+ profondeur;
           return a;
        }
         
          
          public void tail( int taille )
          {
          this.taille = taille; 
          
          }
          public  Conteneur  mettre(Conteneur a,int taille,int i)
          {  
              
              
             
                   this.coffre[i] = a;
             
            return this.coffre[i]; 
           
          }
    
    
        
        
     public float  surface ()
        {
            return this.largueur*this.longueur;
        }
    
}
