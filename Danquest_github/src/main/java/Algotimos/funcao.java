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
public class funcao {
    
    
        // aula11
    
        static int soma(int a, int b){
            System.out.println("***função soma***");
           return a+b;
            }
        
        static int menor(int a, int b){
            System.out.println("***função menor***");
            if(a<=b){
                return a;}
            else{
                return b;
            }
        }
        
        static int entradaDados(){
         System.out.println("***função entrada Dados***");
         Scanner input = new Scanner(System.in);
         System.out.println("Digite o numero: ");
         int n = input.nextInt();
        return n;
        }
        
        public static void main(String[] args){
            
            int n1= entradaDados();
            int n2 = entradaDados();
           
            int r = soma(n1,n2);
            System.out.println("Resultado : " + r);
            
            int m = menor(n1,n2);
             System.out.println("Resultado : " + m);
    }
        
    
}

