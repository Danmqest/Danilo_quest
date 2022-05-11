/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algotimos;

import java.util.Scanner;

/**
 *
 * @author Danilo.maximiano
 */
public class EntadaDadosScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //criação do objeto de Scanner (input)
       Scanner input = new Scanner(System.in);
       
        //declarando as variaveis
       float n1 = 9, n2 = 10, n3 = 2, media; 
       System.out.println("Calculo da media");
       
       //entrada de dados
       System.out.println("Nota 1: ");
       n1 = input.nextFloat();
       System.out.println("Nota 2:  ");
       n2 = input.nextFloat();
       System.out.println("Nota 3; ");
       n3 = input.nextFloat();
       
       //processamento
       media = (n1+n2+n3)/3;

      
       //saida de dados
       System.out.println("media: " + media);
       
       
       
   
    }
    
}
