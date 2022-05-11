/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algotimos;

/**
 *
 * @author danilo.maximiano
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char grade = 'a';

        switch (grade) {
            case 'A':
            //opção de baixo para selecionar (A a)
            case'a':
                System.out.println("Excelente!");
                break;
            case 'B':
            case 'C':
                System.out.println("Bem Feito");
                break;
            case 'D':
                System.out.println("Voce passou!");
                break;
            case 'E':
                System.out.println("Melhor tentar novamente");
                break;
            
                    default:
                System.out.println("Conceito invalido!");

        }

    }

}
