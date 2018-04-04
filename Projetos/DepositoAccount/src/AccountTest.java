/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */


import java.util.Scanner;
        
        
public class AccountTest {
   
   public static void main(String[] args){
      Account account1 = new Account("Jane Gree", 50.00);
      Account account2 = new Account("John Blue", 7.53);
      
      
      
      //exibir saldo inicial do objeto account1 e account2
      System.out.println("___________");
      account1.displayAccount(account1);
      account2.displayAccount(account2);
      System.out.println("__________");
      
      //cria um scanner para realizar as entradas
      Scanner input = new Scanner(System.in);
      
      System.out.print("Valor do deposito da account1: ");
      double depositAmount = input.nextDouble();
      account1.deposit(depositAmount);
      System.out.printf("%n Adicionando o valor de $%.2f para a account1%n", depositAmount);

      
      // exibe os saldos atuais
      System.out.println("___________");
      account1.displayAccount(account1);
      account2.displayAccount(account2);
      System.out.println("__________");

      System.out.print("Valor do deposito da account2: ");
      depositAmount = input.nextDouble();
      account2.deposit(depositAmount);
      System.out.printf("%n Adicionando o valor de $%.2f para a account2%n", depositAmount);
      
      //exibe os saldos finais
      System.out.println("___________");
      account1.displayAccount(account1);
      account2.displayAccount(account2);
      System.out.println("__________");
      
      
   }
  
}