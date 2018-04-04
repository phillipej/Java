/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex514;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex514 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      double amount;
      double principal = 1000.00;
      double rate = 100;
      
      
      
      
      while(rate != 0){
         System.out.println("Qual a taxa de juros: (ex: 0,4) (digite 0 para parar)");
         rate = input.nextDouble();
         if(rate == 0){
            break;
         }
      
         
         System.out.printf("%s%20s %n", "Year", "Amount on deposit");
      
      for(int year = 1; year<=10; ++year){
         
         amount = principal * Math.pow(1.0 + rate, year);
         
         System.out.printf("%4d%,20.2f%n", year, amount);
      }
      }
      
   }
   
}
