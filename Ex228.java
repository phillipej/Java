/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg28;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex228 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      
      Scanner input = new Scanner(System.in);
      
      int x;
      
      System.out.print("Entre com o valor do raio: ");
      x = input.nextInt();
      
      System.out.printf("%nO valor do Diametro é de: %d", (x*2));
      System.out.printf("%nO valor da Circunferencia é de: %f", (2*Math.PI*x));
      System.out.printf("%nO valor da Área é de: %f%n", (Math.PI*x*x));
   }
   
}
