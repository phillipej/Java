/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex614;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex614 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner (System.in);
      System.out.println("Entre com o valor da base");
      int b = input.nextInt();
      System.out.println("Entre com o expoente");
      int expo = input.nextInt();
      
      
      int result = integerPower(b,expo);
      System.out.printf("O resultado de %d ^ %d = %d", b, expo ,result);
      
      
   }
   
   public static int integerPower(int b, int expo){
      int result = b;
      
      
      
      for( int i = 1 ; i < expo; i++){
         
         
         result = b * result;
         
         
//         System.out.println("valor de i: " +i);
//         System.out.println("Valor de b: "+b);
//         System.out.println("Valor de result: "+result);

      }
       return result;
      

   }
      
      
   
}

