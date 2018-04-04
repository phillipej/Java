/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex623;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex623 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      System.out.println("Entre com um valor: ");
      double a = input.nextDouble();
      System.out.println("Entre com um valor: ");
      double b = input.nextDouble();
      System.out.println("Entre com um valor: ");
      double c = input.nextDouble();
      
      System.out.println("O menor valor é: "+minimum3(a,b,c));
      
     
      
   }
   
   public static double minimum3(double a, double b, double c){
     double result = Math.min(a, Math.min(b, c));
      return result;
   }
}
