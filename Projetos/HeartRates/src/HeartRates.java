/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class HeartRates {
   
   private String nome;
   private String sobrenome;
   private int dia;
   private int mes;
   private int ano;
   
   public HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
      
      
   }


   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public void setSobrenome(String sobrenome){
      this.sobrenome = sobrenome;
   }
   public void setDia(int dia){
      this.dia = dia;
   }
   
  public void setMes(int mes){
     this.mes = mes;
  }
   public void setAno(int ano){
      this.ano = ano;
   }
   
   public String getNome(){
      return nome;
   }
   public String getSobrenome(){
      return sobrenome;
   }
   public int getDia(){
      return dia;
   }
   public int getMes(){
      return mes;
   }
   public int getAno(){
      return ano;
   }
   
   
   int max;
   public void setCardMax(int ano){
      max = 220 - (ano-2017);
   }
   
   public int getCardMax(){
      return max;
   }
   
   double maxAlvo;
   public void setMaxAlvo(int max){
      maxAlvo = max*0.8;
   }
   
   double minAlvo;
   public void setMinAlvo(int max){
      minAlvo = max * 0.5;
   }
   
   public double getMaxAlvo(){
      return maxAlvo;
   }
   public double getMinAlvo(){
      return minAlvo;
   }
   
}