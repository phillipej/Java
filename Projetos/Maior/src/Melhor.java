/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author phillipeosorio
 */
public class Melhor {
   
   Scanner input = new Scanner(System.in);
   
   int counter=0;
   int numer=0;
   int maior=0;
   
   public Melhor(){
      
   }

   public int getCounter() {
      return counter;
   }

   public void setCounter(int counter) {
      this.counter = counter;
   }

   public int getNumer() {
      return numer;
   }

   public void setNumer(int numer) {
      this.numer = numer;
   }

   public int getMaior() {
      return maior;
   }

   public void setMaior(int maior) {
      this.maior = maior;
   }
   
  
   public void Maior(){
      while ( counter < 10){
      System.out.print("Digite um numero: ");
      this.numer = input.nextInt();
      
         if ( this.numer > this.maior ){
            this.maior = this.numer;
         }
         counter++;
         
   }
      System.out.println("O maior numero é: " +this.maior);
   
}
}