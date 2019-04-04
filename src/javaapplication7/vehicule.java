



package javaapplication7;

import java.util.*;





public class vehicule {

    public String proprietere;

    public String  carburant;

    private HashMap  Conteneur ;

    private double  coordonnee = x,y;  


   public vehicule(int roue ){
       
   this.Conteneur = new HashMap<Integer,Conteneur>();
   

   }
   public vehicule(vehicule v)
   {
      /*
      this.Conteneur= new HashMap<Integer,Conteneur>();

      for (int i : v.Conteneur.keySet()) {
      Conteneur c  = v.Conteneur.get(i);
      /*
      if(v instanceof vehicule)
      {
         this.Conteneur.put(i, new vehicule();)
      }
   
   
         }

         */
   }


   public String toString()
   {
   return this.largueur;
   }
   
   public Position()
   {
     this.x= x;
     this.y= y; 
   }

};