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
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tamanho: ");
        int t = input.nextInt();
        int[] v = new int[t];
        

//preenche o vetor V
        for(int i=0; i<v.length; i++){
            System.out.printf("vetor [%d]: \n", i);
            v[i]=input.nextInt();
            
        }
       for(int i=0; i<v.length; i++){
           System.out.printf("vetor [%d]: %d \n", i, v[i]);
       }
    
       int soma = 0;
       int maior = v[0];
       int menor = v[0];    
    
    for(int i=0; i<v.length; i++){
        soma = soma + v[i];
        if(v[i]>maior){
            maior = v[i];
        }
        if(v[i]<menor){
            menor = v[i];
        }
    }
    
    for(int i=0; i<v.length; i++){
        System.out.print("v[" + i + "]:" + v[i]);
        if(v[i]== menor)
            System.out.print("<--menor");
            else if(v[i] == maior)
                System.out.print("<--Maior");
            System.out.println("\n");
            
        System.out.println("Soma: " + soma);
            
    }
    }
    
    
}
