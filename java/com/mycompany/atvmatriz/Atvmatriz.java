/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvmatriz;

/**
 *
 * @author Felipe Tesser
 */
public class Atvmatriz {

    public static void main(String[] args) {
        // Matriz a)
        char[][] matrizA = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'}
        };

        // Matriz b)
        int[][] matrizB = {
            {29, 15, 99},
            {47, 35, 100},
            {27, 14, 74}
        };

        // Matriz c)
        double[][] matrizC = {
            {1.9, 2.5, 10.0},
            {2.3, 2.5, 7.4},
            {3.0, 2.2, 6.5}
        };

        // Exibir Matriz A
        System.out.println("Matriz A:");
        for (char[] linha : matrizA) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Exibir Matriz B
        System.out.println("\nMatriz B:");
        for (int[] linha : matrizB) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Exibir Matriz C
        System.out.println("\nMatriz C:");
        for (double[] linha : matrizC) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

