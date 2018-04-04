/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo74;

/**
 *
 * @author phillipeosorio
 */
public class Exemplo74 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      int[] array = {10,20,30,40,50} ;
      
      System.out.printf("%s%8s%n", "Index", "Value");
      
      for (int counter = 0; counter < array.length; counter++)
         System.out.printf("%5d%8d%n", counter, array[counter]);
      
   }
   
}
