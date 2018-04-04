/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excap2soma;
import java.util.Scanner;
/**
 *
 * @author phillipeosorio
 */
public class ExCap2Soma {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int x;
      int y;
      int z;
      int result;
      
      
      System.out.print("Insira o valor do primeiro numero: ");
      x = input.nextInt();
      System.out.print("\nInsira o valor do segundo numero: ");
      y = input.nextInt();
      System.out.print("\nInsira o valor do terceiro numero: ");
      z = input.nextInt();
      
      result = x*y*z;
      System.out.printf("%nO produto é: %d", result);

      
      
   }
   
}
