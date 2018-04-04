/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Employee {
   
   private String nome;
   private String sobrenome;
   private double salarioMensal;
   private double anual;
   private double aumento;
   
   public Employee(String nome, String sobrenome, double salarioMensal){
      
   }
   
   public void setNome(String nome){
      this.nome = nome;
      
   }
   
   public void setSobreno(String sobrenome){
      this.sobrenome = sobrenome;
   }
   
   public void setSalarioMensal(double salarioMensal){
      this.salarioMensal = salarioMensal;
   }
   
   public String getNome(){
      return nome;
   }
   
   public String getSobrenome(){
      return sobrenome;
   }
   
   public double getSalario(){
      return salarioMensal;
   }
   
   
   public void setAnual(double salarioMensal){
      anual = salarioMensal * 12;
   }
   
   public double getAnual(){
      return anual;
   }
   
   public void setAumento(double salarioMensal){
      aumento = anual * 0.1 * 12;
   }
   
   public double getAumento(){
      return aumento;
   }
}
