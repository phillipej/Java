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

public class Analise {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      
      int passou = 0;
      int falhou = 0;
      int resultado = 0;
      
      while (resultado != 8){
         System.out.println("Entre com o resultado ( 1 = passou, 2=falhou, 8 = parar) ");
         resultado = input.nextInt();
         
         if ( resultado == 1 ){
            passou = passou + 1;
         }else{
            falhou = falhou + 1;
            
           
            
            
         }
      }
         
         System.out.println("Passaram: " + passou);
         System.out.println("Falharam: " + falhou);
         
         if ( passou >= 8){
            System.out.println("O professor ganha um bonus");
         }
         
      }
              
             
      
   }
   

