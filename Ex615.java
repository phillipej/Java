/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex615;

/**
 *
 * @author phillipeosorio
 */
import java.util.Scanner;
public class Ex615 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner (System.in);
      
      System.out.println("Entre com o valor do lado: ");
      double side1 = input.nextDouble();
      System.out.println("Entre com o valor do segundo lado: ");
      double side2 = input.nextDouble();
      
      System.out.println("A hipotenusa é: "+hypotenuse(side1,side2));
   }
   
   
   public static double hypotenuse(double a, double b){
      double x = Math.hypot(a, b);
      return x;
   }
   
}
