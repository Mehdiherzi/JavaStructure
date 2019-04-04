



package javaapplication7;

import java.util.HashMap;

java.util.*;


public class vehicule {

  
    private HashMap  Conteneur ;


   public vehicule(int roue ){
       
   this.Conteneur = new HashMap<Integer,Conteneur>();
   this.roue = roue;

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
   
   public void  sorti()
   {
   
   }


};