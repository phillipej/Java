/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class CalculadoraIMC {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      int peso = 0;
      float altura = 0;
      
      System.out.print("Digite o seu peso em Kg: ");
      peso = input.nextInt();
      System.out.print("\nDigite a sua altura em Metros: ");
      altura = input.nextFloat();
      
      System.out.println("\n\n****************************************");
      System.out.println("           VALORES IMC     ");
      System.out.println("   Abaixo do Peso:    Menos de 18,5");
      System.out.println("   Normal:            Entre 18,5 e 24,9");
      System.out.println("   Acima do Peso:     Entre 25 e 29,9");
      System.out.println("   Obeso:             Acima de 30");
      System.out.println("****************************************\n\n");
      
      System.out.printf("\nO seu IMC é de : %f\n", peso/(altura*altura));
    
      
      
      
   }
   
}
