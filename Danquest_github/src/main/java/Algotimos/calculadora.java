/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algotimos;

import java.util.Scanner;

/**
 *
 * @author danilo.maximiano
 */
public class calculadora {
    
    static int menu(){
       // Scanner input = new Scanner(System.in);
        
        System.out.println("*--Menu--*");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multitiplicação");
        System.out.println("4 - Divisão");
        
         int op = funcao.entradaDados(); // importei de outra classe
        //int op = input.nextInt();
        return op;
        // usar um do while para não ter resposta mainor que 4
    }
    static double entradaDados(){
        System.out.println("*--Entrada de Dados--*");
        Scanner input = new Scanner(System.in);
        System.out.println("*Numero*");
        double n = input.nextDouble();
        return n;
    }
    
    static double add(double n1, double n2){
        System.out.println("*--Adição--*");
        double r = n1+n2;
        return r;
    }
    
    static double sub(double n1, double n2){
    System.out.println("*--Subtração--*");
        double r = n1-n2;
        return r;
   }
    static double mult(double n1, double n2){
        System.out.println("*--Multiplicação--*");
        double r = n1*n2;
        return r;
        
    }
    static double div(double n1, double n2){
        System.out.println("*--Divisao--*");
        double r = n1/n2;
        return r;
        
    }
    
    static void imprimir(double resultado){
        System.out.println("*--Imprimir--*");
        System.out.println("Resultado;" + resultado);
        
    }
    static double controlador(double n1, double n2, int op){
        System.out.println("Controlador");
        double r = 0;
        
        switch (op){
            case 1:
                r = add(n1, n2);
                break;
            case 2:
                r = sub(n1, n2);
                break;
            case 3:
                r = mult(n1, n2);
                break;
            case 4:
                r=div(n1, n2);
                break;
                
        }
        return r;
    }
    
    public static void main(String[] args){
        int op = menu();
        double n1 = entradaDados();
        double n2 = entradaDados();
        double r = controlador(n1, n2, op);
        imprimir(r);
        
        
        
    }
    
    
}
    
    
