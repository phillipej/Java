
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Consumo {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      int km=0;
      int gasolina=0;
      
 
      
      int totalKm = 0;
      int totalGasolina = 0;
      
      while ( km != -1){
         
         totalKm = km + totalKm;
         totalGasolina = gasolina + totalGasolina;
         
         System.out.print("Entre com os km: (-1 para) ");
         
         km = input.nextInt();
         if ( km != -1){ // caso a entrada seja menos 1, o programa nao executa a entrada de litro e para o while.
             System.out.print("Entre com os litros: ");
             gasolina = input.nextInt();
         }
         
         double media = (double) km/gasolina;
      
         System.out.printf("\nA media de gasto dessa viagen é de: %.2f litros por km ",media);
         System.out.println("\n\n");
        
         
      }
      
      
      System.out.println("\n\n\n_____________________________________________");
      System.out.println("O total de Km pecorridos é de:  "+ totalKm);
      System.out.println("O total de gasolina gasto é de: "+ totalGasolina);
      
      
   }
  
}
