/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Date {
   
   private int mes;
   private int dia;
   private int ano;
   private String dataFinal;
   
   public Date(int mes, int dia, int ano){
   }
   
   public void setMes(int mes){
      this.mes = mes;
   }
   
   public void setDia(int dia){
      this.dia = dia;
   }
   
   public void setAno(int ano){
      this.ano = ano;
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
   
   public String displayDate(int dia, int mes, int ano)
   {
     
     String dataFinal = dia + "/" + mes + "/" + ano;
     return dataFinal;
      
   }

}