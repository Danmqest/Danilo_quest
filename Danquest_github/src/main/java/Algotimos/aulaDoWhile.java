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
public class aulaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  int i =0, j=10;
        //do{
        //  System.out.println("Teste");
        //i++;
        //}while(i>j);

        //Scanner input = new Scanner(System.in);
       // int op;
       // do {
          //  System.out.println("1-Adição");
          //  System.out.println("2-Subtração");
          //  System.out.println("3-Multiplicação");
          //  System.out.println("4-Divisão");
          //  System.out.println("Opção: ");
          //  op = input.nextInt();
       // } while (op > 4 || op < 1);

       //exemplo 04
       
       Scanner input= new Scanner(System.in);
       int x, soma = 0, i=0;
       while (i<=10){
           System.out.println("Numero:");
           x = input.nextInt();
           if (x<0){
               break; 
           }
           soma += x; // soma=soma=x
           i++;
           }
       System.out.println("Soma :" + soma);
       
       }
       
               
               
        
       
       
        
    }

