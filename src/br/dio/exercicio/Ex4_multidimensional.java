package br.dio.exercicio;

import java.util.Random;

public class Ex4_multidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];
                // primeira abertura de [] significa linha; a segunda, é coluna.

        for(int i = 0; i < M.length; i++ ) {
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for(int elementodaColuna : linha) {
                System.out.println(elementodaColuna + " ");
            }

        }

    }
}
