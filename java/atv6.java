/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Tesser
 */import javax.swing.JOptionPane;
public class atv6 {
    
    public static void main(String[] args) {
        // Definindo o tamanho da matriz
        final int LIN = 3; // Número de linhas
        final int COL = 3; // Número de colunas
        int[][] matriz = new int[LIN][COL];

        // Entrada de dados: preenchendo a matriz com valores fornecidos pelo usuário
        JOptionPane.showMessageDialog(null, "** Cadastro de dados na matriz **\nEntre com o valor de cada posição da matriz!");
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                String input = JOptionPane.showInputDialog(null, "Valor na posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input); // Converte a entrada para inteiro
            }
        }

        // Exibindo os valores armazenados na matriz
        StringBuilder resultado = new StringBuilder("** Matriz Preenchida **\n");
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                resultado.append(matriz[i][j]).append(" ");
            }
            resultado.append("\n"); // Nova linha para cada linha da matriz
        }

        // Mostrando a matriz em uma mensagem
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

