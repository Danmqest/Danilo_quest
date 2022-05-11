/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Danilo.maximiano
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercicio 02
        
        Scanner input = new Scanner(System.in);
        
        double base, expoente;
        System.out.println("Exercicio 02");
        
        System.out.println("Base: ");
        base = input.nextFloat();
        System.out.println("Expoente: ");
        expoente = input.nextFloat();
        
        double resultadoFinal = Math.pow(base, expoente);
        
        System.out.println("O Resultado =" + resultadoFinal);
        
        
    }
    
}
