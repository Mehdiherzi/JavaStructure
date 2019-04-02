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
        private int  emplacement
        
        public Conteneur coffre[];    
        
        
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
         
          
          public void tail(int taille)
          {
          this.taille = taille; 
           this.coffre = new  Conteneur[this.taille]; 
          }
          
          
          
          public  void mettre(Conteneur a,int i)
          {  
                  
                
                this.coffre[i]=a;
              
          }
          
          public Conteneur [] voirlecoffre()
          {
              
              return this.coffre;
          }
    
    
        
        
     public float  surface ()
        {
            return this.largueur*this.longueur;
        }
    
}
