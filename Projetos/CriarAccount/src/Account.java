/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Account {
   
   
   private String name; // variável de instância
   private Double balance; // variável de intância
   
   
   //Construtor de account recebe dois parâmetros
   public Account(String name, double balance){
      
     this.name = name; //atribui name para a variavel de instancia name
     
     
     if(balance >0.0){
        this.balance = balance;
     }
     
    }
   
   //método que faz o depósito no salado
   public void deposit(double depositAmount){
      
      if (depositAmount > 0.0)
         balance = balance + depositAmount;
   }
   
   //método que retorna o saldo na conta
   public double getBalance()
   {
      
      return balance;
   }
   
   //método que define o nome
   public void setName(String name){
      this.name = name;
   }
   
   //método que retorna o nome
   public String getName(){
      return name;
   }
   
   //método que realiza withdraw
   public void saque(double saquetotal){
      
      
      if(saquetotal>balance){
         System.out.println("O saque é maior que o valor disponivel");
      }
      if(saquetotal<balance){
         balance = balance - saquetotal;
      }
      
   }
  
}
