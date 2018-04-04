/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Cliente {
   
   
   
   
   private int numConta;
   private int saldoIn;
   private int totalCobrados;
   private int totalCreditos;
   private int limite;
   
   public Cliente(){
      this.numConta = 111;
      this.saldoIn = 2000;
      this.totalCobrados = -1500;
      this.totalCreditos = 10;
      this.limite = 2000;
      
   }

   public int getNumConta() {
      return numConta;
   }

   public void setNumConta(int numConta) {
      this.numConta = numConta;
   }

   public int getSaldoIn() {
      return saldoIn;
   }

   public void setSaldoIn(int saldoIn) {
      this.saldoIn = saldoIn;
   }

   public int getTotalCobrados() {
      return totalCobrados;
   }

   public void setTotalCobrados(int totalCobrados) {
      this.totalCobrados = totalCobrados;
   }

   public int getTotalCreditos() {
      return totalCreditos;
   }

   public void setTotalCreditos(int totalCreditos) {
      this.totalCreditos = totalCreditos;
   }

   public int getLimite() {
      return limite;
   }

   public void setLimite(int limite) {
      this.limite = limite;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   //método para calcular o novo saldo
   int novoSaldo;
   public void novoSaldo(int a, int b, int c){
      novoSaldo = a + b - c ;
   }
   //método para apresentar o status atual do cliente
   public void status(){
      System.out.println("O novo saldo é: " +this.novoSaldo);
         if( this.novoSaldo <= this.limite){
            System.out.println("Nao excede o limite de creditos");
         }else{
            System.out.println("Limite de creditos excedido");
         }
      
      
   }
   
   
   
   
   
   
   
}
