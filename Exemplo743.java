/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo743;

/**
 *
 * @author phillipeosorio
 */
public class Exemplo743 {

   /**
    * @param args the command line arguments
    */
   
   
   public static void main(String[] args) {
      // TODO code application logic here
      final int ARRAY_LENGHT = 10;
      int[] array = new int[ARRAY_LENGHT];
      
      
      for( int counter = 0; counter < array.length; counter++)
         array[counter] = 2+2*counter;
      
      System.out.printf("%s%8s%n", "Index", "Value");
      
      for(int counter = 0; counter<array.length; counter++)
         System.out.printf("%5d%8d%n", counter, array[counter]);
   }
   
}
