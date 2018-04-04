/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
import java.io.PrintStream;
import java.util.Scanner;

public class InvoiceTeste {
   
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      Invoice total1 = new Invoice("1", "carne", 3, 3.5 );
      
      
      System.out.println("Digite o código do produto: ");
      String cod = input.next();
      total1.setNumero(cod);
      
      
      System.out.println("Digite o nome do produto: ");
      String nome = input.next();
      total1.setDescricao(nome);
      
      System.out.println("Digite o quantidade de produtos: ");
      int qnt = input.nextInt();
      total1.setQuantidade(qnt);
      
      System.out.println("Digite o preco do produto: ");
      double preco = input.nextDouble();
      total1.setPreco(preco);

      
      total1.getInvoiceAmount(qnt, preco);
      
      System.out.printf("%.2f", total1.retInvoice());
      
      System.out.printf("Cod: %s, produto: %s, quantidade: %d, preco: %.2f, total: %.2f", cod, nome, qnt, preco, total1.retInvoice());
        
      
      
      
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              ;
      
      
      
      
  
      
      
      
     
     
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
   
}
