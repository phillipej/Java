/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Invoice {
   
   private String numero;
   private String descricao;
   private int quantidade;
   private double preco;
   private double invoiceAmount;
   
   public Invoice(String numero, String descricao, int quantidade, double preco){

      
   }   
      //metodo 
   
      public void setNumero (String numero){
      this.numero = numero;
   }
      
      public void setDescricao (String descricao){
         this.descricao = descricao;
      }
      
      public void setQuantidade (int quantidade){
         
         if(quantidade<0){
         quantidade = 0;
         }
         
         this.quantidade = quantidade;
         
      }
      
      public void setPreco (double preco){
         
         if(preco<0.0)
         {
         preco = 0.0;
         }
         
         this.preco = preco;
 
      }
      
      public String getNumero(){
      return numero;
      }
      
      public String getDescricao(){
      return descricao;
      }
      public int getQuantidade(){
      return quantidade;
      }
      public double getPreco(){
      return preco;
      }
      
      public void getInvoiceAmount(int quantidade, double preco){
      invoiceAmount = quantidade*preco;
        
      }
      
      public double retInvoice(){
         return invoiceAmount;
      }
      
    
   }
  
