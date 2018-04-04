/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo746;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author phillipeosorio
 */
public class Exemplo746 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here

      SecureRandom randomNumber = new SecureRandom();
      int[] frequency = new int[7];
      
      System.out.println(frequency[6]);
      
      
      
      for(int roll = 1; roll<=100; roll++){
         ++frequency[1+ randomNumber.nextInt(6)];
         //System.out.println(Arrays.toString(frequency));
         
      }
      
      System.out.printf("%s%10s%n", "Face", "Frequency");
      
      for( int face=1; face < frequency.length; face++)
         System.out.printf("%4d%10d%n", face, frequency[face]);
      
   }

}
