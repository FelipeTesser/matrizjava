/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Tesser
 */
  import java.util.Scanner;
public class atv2 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];

        // Preenchendo a matriz 5x5 com valores fornecidos pelo usuário
        System.out.println("Digite os valores para preencher a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

                // Soma de números ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }

                // Soma de cada coluna
                somaColunas[j] += matriz[i][j];

                // Soma de cada linha
                somaLinhas[i] += matriz[i][j];
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo resultados
        System.out.println("\nSoma dos números ímpares: " + somaImpares);

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            System.out.printf("Coluna %d: %d%n", j + 1, somaColunas[j]);
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Linha %d: %d%n", i + 1, somaLinhas[i]);
        }

        scanner.close();
    }
}

