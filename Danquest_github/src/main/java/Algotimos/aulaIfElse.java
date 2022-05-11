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
public class aulaIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculando Media !");

        float n1, n2, media, faltas, sub, mSub;

        System.out.println("Nota Av 1: ");
        n1 = input.nextFloat();
        System.out.println("Nota Av 2: ");
        n2 = input.nextFloat();
        System.out.println("Quantidade de Faltas do aluno ?");
        faltas = input.nextFloat();

        media = (n1 + n2) / 2;
        System.out.println("Sua media foi, " + media);

        if (media >= 6 && faltas < 18) {
            System.out.println("Aprovado!");
        } else {
            // System.out.println("Reprovado!");
        }
        if (media < 6) {
            System.out.println("Recuperação");
            System.out.println("Nota da Sub:");
            sub = input.nextFloat();

            mSub = (media + sub) / 2;
            if (mSub >= 6) {
                System.out.println("Aprovado !");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.println("Reprovado Por Falta !");

        }

    }

}
