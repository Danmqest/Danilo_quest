/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FunTest;

import java.util.Scanner;

/**
 *
 * @author danilo.maximiano
 */
public class funtest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String chave;
        
       System.out.println("Charada da Morte, errou morreu. Hahaha bOA sorte.");
       System.out.println("O que é o que é clara e salgada cabe em um olho e pesa uma tonelada tem sabor de mar pode ser discreta. ?");
       chave = input.nextLine();
       
       
       
       if( chave.equals("Lagrimas") || chave.equals("lagrima")){
           System.out.println("Voce vive !!!!");}
       else{ 
           System.out.println("Voce morreu! KKKKK");}
       
       }
      
        
    }
    
}
