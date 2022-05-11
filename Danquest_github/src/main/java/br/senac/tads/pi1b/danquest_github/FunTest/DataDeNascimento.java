/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FunTest;

import java.util.Scanner;

/**
 *
 * @author danilo.maximiano
 */
public class DataDeNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int anoNascimento, resultadoFinal;
        System.out.println("Vamos Calcular sua idade com base no ano de nascimento ? ");
        
      System.out.println("Me diga seu ano de nascimento:");
      anoNascimento = input.nextInt();
     
      
      resultadoFinal = (2022 - anoNascimento) + 3;
      System.out.println("Em 2025 voce tera " + resultadoFinal + " anos.");
      
    }
    
}
