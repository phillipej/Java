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

public class CalculoSalario {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      Empregados e1 = new Empregados();
      Empregados e2 = new Empregados();
      Empregados e3 = new Empregados();
      
     
      e1.cadastroFuncionario();
      e1.salarioBruto();
      
      e2.cadastroFuncionario();
      e2.salarioBruto();
      
      e3.cadastroFuncionario();
      e3.salarioBruto();
      
      
      

     // e1.Status();
      
      
   }
          
}
