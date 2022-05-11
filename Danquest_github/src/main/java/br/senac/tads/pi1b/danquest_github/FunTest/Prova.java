package br.senac.tads.pi1b.danquest_github.FunTest;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/** // Escreva um programa em Java que leia n notas do teclado e calcule a média das notas. 
 * // O Programa deve imprimir a maior, menor e média das notas.
 *
 * @author danilo.maximiano
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantas notas a somar: ");
       
        int n = input.nextInt();
        int i=0, nota=0;
        
        float media, mediaFinal;
        
        while(i<n){  
        System.out.println("Valor nota: ");
        nota = input.nextInt();
        i++;
        
       
        }
        
        switch(nota){
            case 1:
                System.out.println("Nota: " + nota);
                break;
                case 2:
                System.out.println("Nota: " + nota);
                break;
                case 3:
                System.out.println("Nota: " + nota);
                break;
                case 4:
                System.out.println("Nota: " + nota);
                break;
                case 5:
                System.out.println("Nota: " + nota);
                break;
                case 6:
                System.out.println("Nota: " + nota);
                break;
                case 7:
                System.out.println("Nota Maior: " + nota);
                break;
                case 8:
                System.out.println("Nota Maior: " + nota);
                break;
                case 9:
                System.out.println("Nota Maior: " + nota);
                break;
                case 10:
                System.out.println("Nota Maior: " + nota);
                break;
        }
           media = nota+nota;
        mediaFinal = media/n;
        
        System.out.println("Sua media e de: " + mediaFinal);
        
        
        
        }
        
        
        
        
    }
    

