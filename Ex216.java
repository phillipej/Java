/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex216;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex216 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int x;
      int y;
     
      
      System.out.print("Insira o primeiro numero: ");
      x = input.nextInt();
      
      
      System.out.print("Insira o segundo numero: ");
      y = input.nextInt();
      
      
      if(x>y)
         System.out.printf("O numero %d é maior", x);
      if(y>x)
         System.out.printf("O numero %d é maior", y);
      if(x==y)
         System.out.println("Os nummeros sao iguais");
   }
   
}
