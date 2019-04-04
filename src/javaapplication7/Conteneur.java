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
        private int  emplacement;
        
        public Conteneur coffre[];     

        public Conteneur alphacube [][][]; 
        
        
        public Conteneur(float largueur ,float longueur,float profondeur ,int emplacement ){
          
         this.largueur = largueur;  
         this.longueur= longueur; 
         this.profondeur = profondeur;
         
         Ville v   = new  Ville();
         
         
         Conteneur a[] = new Conteneur[this.taille] ; 
    
             this.emplacement = emplacement;
        }
        
        
          public   String  toString()
        {
            String a= " largueur " + largueur+ " longueur "+longueur+" profondeur "+ profondeur + " emplacement "+ emplacement ;
           return a;
        }    
          public void tail(int taille)
          {
          this.taille = taille; 
           this.coffre = new  Conteneur[this.taille]; 
          }
          
          
          
          public  void mettre(Conteneur a,int l)
          {  
                        
                this.coffre[l]=a;
              
          }
          
          public Conteneur [] voirlecoffre()
          {
              
              return this.coffre;
          }
    
    
        
        
     public float  surface ()
        {
            return this.largueur*this.longueur;
        }
    public float volume ()
    {

        return this.profondeur*this.largueur*this.longueur;
        
    }

    
}
