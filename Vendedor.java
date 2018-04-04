
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
public class Vendedor {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      double itemVendido=0;
      double totalVenda=0;
      
      
      while(itemVendido != -1){
         totalVenda = totalVenda + itemVendido;
         
         System.out.println("Entre com o valor do produto: (digite -1 para finalizar) ");
         itemVendido = input.nextDouble();
   }
      double comissao = (totalVenda*9)/100;
      System.out.println("O total de vendas é de: " +totalVenda);
      System.out.printf("A comissao é de: %.2f", comissao );
      System.out.printf("O total a receber é de: %.2f", 200+comissao );
      
      
   }
   
}
