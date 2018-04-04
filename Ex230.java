/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex230;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex230 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int x;
      
      System.out.print("Entre com um numero de 5 algarismos");
      x = input.nextInt();
      
      System.out.printf("%d %d %d %d %d\n", x / 10000, x % 1000 / 100, x % 100 / 100 , x % 10 / 100,x % 10); 
   }
   
}
