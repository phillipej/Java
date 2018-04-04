/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex617;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex617 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      int i =0;
      while (i >= 0){
      
      System.out.println("Digite um numero: (digite um num negativo para finalizar)");
      int a = input.nextInt();
         System.out.println("O numero é par? : "+isEven(a));
   }
      
      
   }
      

   public static boolean isEven(int a){
      
      return a%2==0; // retorna verdadeiro caso o resto seja 0
   }
}
