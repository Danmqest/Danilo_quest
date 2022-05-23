/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algotimos;

import java.util.Scanner;

/**
 *
 * @author danilo.maximiano
 */
public class vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho");
        int t = input.nextInt();
        
        int[] vetor = new int[t];
        
        for(int i=0; i<vetor.length; i++){
            System.out.printf("vetor[%d]: \n", i);
        vetor[i]=input.nextInt();
        }
        // muito importante vetor.length - preenche o valor do vetor  
        for(int i=0; i<t; i++){
           
            if(vetor[i]%2==1)
            System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
        
    }
    
}
}