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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        System.out.println("Exercicio 03");
        
        int c1, c2;
        System.out.println("Consecutivo 01 : ");
        c1 = input.nextInt();
        System.out.println("Consecutivo 02: ");
        c2 = input.nextInt();
        
        int resultadoFinal01 = (c1 + 1);
        int resultadoFinal02 = (c2 + 1);
        
        
        System.out.println("Os consecutivos : " + resultadoFinal01);
        System.out.println("Os Consecutivos : " + resultadoFinal02);
    }
    
}
