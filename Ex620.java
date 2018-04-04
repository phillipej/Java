/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex620;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex620 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      System.out.print("Digite o valor do raio: ");
      double raio = input.nextDouble();
      
      System.out.printf("O valor da área é de: %.2f ",circleArea(raio));
   }
   
   
   public static double circleArea(double a){
      
      double result = Math.PI * (a*a);
      return result;
      
      
      
      
   }
   
}
