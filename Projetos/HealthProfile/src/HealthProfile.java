/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class HealthProfile {
   
   public String nome;
   public String sexo;
   public int ano;
   public double altura;
   public double peso;
   
   public HealthProfile (String nome, String sexo, int ano, double altura, double peso){
      
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getNome(){
      return nome;
   }
   
   
   public void setSexo(String sexo){
      this.sexo = sexo;
   }
   public String getSexo(){
      return sexo;
   }
   
   public void setAno(int ano){
      this.ano = ano;
   }
   public int getAno(){
      return ano;
   }
   
   public void setAltura(double altura){
      this.altura = altura;
   }
   public double getAltura(){
      return altura;
   }
   
   public void setPeso(double peso){
      this.peso = peso;
   }
   public double getPeso(){
      return peso;
   }
   
   //método para calcular idade
   
  public void setIdade(int ano){
     idade = 2017 - ano;
  }
  int idade;
  public int getIdade(){
     return idade;
  }
  
  // métodos freguencia cardiaca max e min
  
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
   
   // metodo para calcular IMC
   
   double imc;
   public void setImc(double peso, double altura){
      imc = (peso)/(altura*altura);
   }
   public double getImc(){
      
      return imc;
}
  
   
}
