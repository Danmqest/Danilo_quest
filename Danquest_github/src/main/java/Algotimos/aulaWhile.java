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
public class aulaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // exemplo 01 e correto
       // int i=0;
      // while(i<=10){
         //  System.out.println("Algoritimos " + i);
         //  i=i+1;}
         
         
         // exemplo 02 e correto
         Scanner input = new Scanner(System.in);
         
         System.out.println("Inicio");
         int i = input.nextInt();
         System.out.println("Fim");
         int f = input.nextInt();
        
         // Para obter numeros Pares (ex> i%2 ==0) numeros impar (ex> i%2==1)
         if(i<f){
             System.out.printf("%d E menor que %d",i ,f);
         }else{
         while(i>= f){
             if(i%2==1){ //% na conta e o resto !! 
             System.out.println("i: " + i);}
             i--; //ou f++ crecente
             // caso i fosse 100 e f 200 não entra no laço
            }}
         System.out.println("fora do laço");
    }
    
}
//debug
//java visualizer - https://cscircles.cemc.uwaterloo.ca/java_visualize/
// python tuto    - https://pythontutor.com/java.html#mode=edit