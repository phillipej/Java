/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex225;
import java.util.Scanner;
/**
 *
 * @author phillipeosorio
 */
public class Ex225 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int x;
      
      System.out.print("Digite um numero: ");
      x = input.nextInt();
      
      if(x%2==0)
         System.out.printf("O numero é par %n");
      
      if(x%2 != 0)
         System.out.println("O numero é ímpar");
      
   }
   
}
