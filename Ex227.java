/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex227;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex227 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int x;
      int y;
      
      System.out.print("Digite o primeiro numero: ");
      x = input.nextInt();
      
      System.out.print("Digite o primeiro numero: ");
      y = input.nextInt();
      
      if(x%y == 0)
         System.out.printf("\nO numero %d é multiplo do numero %d", x, y);
         
      
      
      
      
      
      
   }
   
}
