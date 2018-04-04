/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex217;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex217 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int number3;
      int sum;
      
      System.out.print("Entre com o primeiro número: ");
      number1 = input.nextInt();
      
      System.out.print("\nEntre com o segundo número: ");
      number2 = input.nextInt();
      
      System.out.print("\nEntre com o terceiro número: ");
      number3 = input.nextInt();
      
      System.out.printf(" A soma dos numeros é: %d%n " , (number1+number2+number3));
      System.out.printf("A multiplicacao dos numeros é: %d%n " , (number1*number2*number3));
      System.out.printf("A media dos numeros é: %d%n ", ((number1+number2+number3)/3));
      
      
      //Encontrando o maior com IF
      if(number1>number2 & number1>number3)
         System.out.printf("O numero %d é o maior: ",number1);
      
      if(number2>number3 & number2>number1)
         System.out.printf("O numero %d é o maior: ",number2);
      
      if(number3>number2 & number3>number1)
         System.out.printf("O numero %d é o maior: ",number3);
      
      //Encontrando o menor com IF
       if(number1<number2 & number1<number3)
         System.out.printf("O numero %d é o menor: ",number1);
      
      if(number2<number3 & number2<number1)
         System.out.printf("O numero %d é o menor: %n",number2);
      
      if(number3<number2 & number3<number1)
         System.out.printf("O numero %d é o menor: ",number3);
   }
   
}
