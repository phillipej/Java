
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class Empregados {
   
   private String nome;
   private int horasTrabalhadas;
   private double salarioHora;

   public Empregados() {
      
   }
   
 

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getHorasTrabalhadas() {
      return horasTrabalhadas;
   }

   public void setHorasTrabalhadas(int horasTrabalhadas) {
      this.horasTrabalhadas = horasTrabalhadas;
   }

   public double getSalarioHora() {
      return salarioHora;
   }

   public void setSalarioHora(double salarioHora) {
      this.salarioHora = salarioHora;
   }
   
   public void salarioBruto(){
      
      if (this.getHorasTrabalhadas() <= 40){
      double salarioBruto = (double) this.horasTrabalhadas * this.getSalarioHora();
         System.out.print("O salario bruto é: %n%n" +salarioBruto);
      }
   
      if(this.getHorasTrabalhadas() > 40){
      
         double salarioNormal = 40 * this.getSalarioHora(); // calcula o salario para 40hrs
         double horaExtra = (double) (this.getHorasTrabalhadas() - 40) * (this.getSalarioHora()/2);// calcula o salario para as hrs extra.
         double salarioHoraExtra = (double) horaExtra + salarioNormal;//soma o salario com as horas extras
         //System.out.println(horaExtra);
         System.out.printf("O salario bruto é: %.2f%n%n", salarioHoraExtra);
      }
      
   }
      
      //método cadastra funcionario
      Scanner input = new Scanner(System.in);
      public void cadastroFuncionario(){
         System.out.print("Qual o nome do funcionario: ");
          this.setNome(input.next());
         System.out.print("Quantas horas trabalhou na semana: ");
         this.setHorasTrabalhadas(input.nextInt());
         System.out.printf("Qual o valor da hora do funcionario %s: " ,this.getNome());
         this.setSalarioHora(input.nextDouble());
         
      }
      //método para checar as informacoes
      public void Status(){
         System.out.println("Nome: "+this.getNome());
         System.out.println("Horas: "+this.getHorasTrabalhadas());
         System.out.println("Preco hora: "+this.getSalarioHora());
      }
}
   

