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
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Exercicio 03");
        
        int n1, n2;
        System.out.println("Numero 1: ");
        n1 = input.nextInt();
        System.out.println("Numero 2: ");
        n2 = input.nextInt();
        
        int resultadoFinal01 = (n1*n1);
        int resultadoFinal02 = (n2*n2);
        
        
        System.out.println("O dobro do numero 1 é: " + resultadoFinal01);
        System.out.println("O dobro do numero 2 é: " + resultadoFinal02);
        
        
    }
    
}
