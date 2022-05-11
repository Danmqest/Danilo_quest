/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author danilo.maximiano
 */
public class switchcaseIFELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int nota1, nota2, media;
char grade = 0;
        
        System.out.println("Digite As notas: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();

        media = (nota1 + nota2) / 2;
        
        if(media>=9){
            grade = 'A';}
        else if(media>=8 && media<9){
            grade = 'B';}
        else if(media>=7 && media<8){
            grade = 'C';}
        // ate o final
        
        switch (grade){
            case 'A':
                System.out.println("Conceito A");}
        // Ate o default
        
            
        }
    }
    
}
