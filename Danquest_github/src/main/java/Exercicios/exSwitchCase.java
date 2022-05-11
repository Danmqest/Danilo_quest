/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author danilo.maximiano
 */
public class exSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//calcular a media de 2 notas.
        Scanner input = new Scanner(System.in);
        int nota1, nota2, media;

        System.out.println("Digite As notas: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();

        media = (nota1 + nota2) / 2;

        switch (media) {
            case 9:
            case 10:
                System.out.println("Conceito A");
                break;
            case 8:
                System.out.println("Conceito B");
                break;
            case 7:
                System.out.println("Conceito C");
                break;
            case 6:
                System.out.println("Conceito D");
                break;
            default:
                System.out.println("Reprovado!");

        }
        {
        }

    }
