/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Tesser
 */ import javax.swing.JOptionPane;
public class atv7 {
    
    public static void main(String[] args) {
        // Definindo a matriz
        double[][] matriz = {
            {4.5, 5.2},
            {4.2, 2.1}
        };

        // Criando o texto para exibir os valores da matriz
        StringBuilder resultado = new StringBuilder("** Exibição dos valores da matriz **\n");

        for (int x = 0; x < 2; x++) { // Laço para linhas
            for (int y = 0; y < 2; y++) { // Laço para colunas
                resultado.append("mat[").append(x).append("][").append(y).append("] = ").append(matriz[x][y]).append("\n");
            }
        }

        // Exibindo os valores da matriz em um diálogo
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

