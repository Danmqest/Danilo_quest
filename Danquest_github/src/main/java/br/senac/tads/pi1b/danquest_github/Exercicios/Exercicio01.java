package Exercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Danilo.maximiano
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercicio 01
        
        Scanner input = new Scanner(System.in);
        
        float p1, p2, produtoFinal;
        System.out.println("Produto Final");
        
        System.out.println("Produto 1:  ");
        p1 = input.nextFloat();
        System.out.println("Produto 2:  ");
        p2 = input.nextFloat();
        
        produtoFinal = p1*p2;
        System.out.println("Soma dos Produtos =" + produtoFinal);
        
       
        
        
        
        
        
        
        
    }
    
}
