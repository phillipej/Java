/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex224;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex224 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int number3;
      int number4;
      int number5;
     
      
      System.out.print("Entre com o primeiro número: ");
      number1 = input.nextInt();
      
      System.out.print("\nEntre com o segundo número: ");
      number2 = input.nextInt();
      
      System.out.print("\nEntre com o terceiro número: ");
      number3 = input.nextInt();
      
      System.out.print("\nEntre com o quarto número: ");
      number4 = input.nextInt();
      
      System.out.print("\nEntre com o quinto número: ");
      number5 = input.nextInt();
      
      
      
      //verificando qual o maior
      if(number1>number2 & number1>number3 & number1>number4 & number1>number5)
         System.out.printf("O numero %d é o maior", number1);
      
      if(number2>number1 & number2>number3 & number2>number4 & number2>number5)
         System.out.printf("O numero %d é o maior", number2);
      
      if(number3>number1 & number3>number2 & number3>number4 & number3>number5)
         System.out.printf("O numero %d é o maior", number3);
      
      if(number4>number1 & number4>number2 & number4>number3 & number4>number5)
         System.out.printf("O numero %d é o maior", number4);
      
      if(number5>number1 & number5>number2 & number5>number3 & number5>number4)
         System.out.printf("O numero %d é o maior", number5);
      
      
      //verificando o menor
      if(number1<number2 & number1<number3 & number1<number4 & number1<number5)
         System.out.printf("O numero %d é o menor", number1);
      
      if(number2<number1 & number2<number3 & number2<number4 & number2<number5)
         System.out.printf("O numero %d é o menor", number2);
      
      if(number3<number1 & number3<number2 & number3<number4 & number3<number5)
         System.out.printf("O numero %d é o menor", number3);
      
      if(number4<number1 & number4<number2 & number4<number3 & number4<number5)
         System.out.printf("O numero %d é o menor", number4);
      
      if(number5<number1 & number5<number2 & number5<number3 & number5<number4)
         System.out.printf("%nO numero %d é o menor", number5);
      
      
      
      
      
   }
   
   
   
}
