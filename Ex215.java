/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg15;

import java.util.Scanner;


/**
 *
 * @author phillipeosorio
 */
public class Ex215 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int sum;
      
      System.out.print("Entre com o primeiro número: ");
      number1 = input.nextInt();
      
      System.out.print("\nEntre com o segundo número: ");
      number2 = input.nextInt();
      
      System.out.printf(" A soma dos numeros é: %d%n " , (number1+number2));
      System.out.printf("A subtracao dos numeros é: %d%n " , (number1-number2));
      System.out.printf("A divisao dos numeros é: %d%n ", (number1/number2));
      



      
   }
   
}
