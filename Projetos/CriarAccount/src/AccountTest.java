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
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
      
      //cria um scanner para realizar as entradas
      Scanner input = new Scanner(System.in);
      
      System.out.print("Valor do deposito da account1: ");
      double depositAmount = input.nextDouble();
      account1.deposit(depositAmount);
      System.out.printf("%n Adicionando o valor de $%.2f para a account1%n", depositAmount);

      
      // exibe os saldos atuais
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

      System.out.print("Valor do deposito da account2: ");
      depositAmount = input.nextDouble();
      account2.deposit(depositAmount);
      System.out.printf("%n Adicionando o valor de $%.2f para a account2%n", depositAmount);
      
      // realiza saque account1
      System.out.printf("%n Valor do saque na account1: ");
      double saque = input.nextDouble();
      account1.saque(saque);
      
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance()); 
     
      //realiza saque account2
      System.out.printf("%n valor do saque na account2: ");
      saque = input.nextDouble();
      account2.saque(saque);
      
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance());
      
      
      //exibe os saldos finais
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance()); 
      
      
   }
   
   
   
   
   
   
   
}
