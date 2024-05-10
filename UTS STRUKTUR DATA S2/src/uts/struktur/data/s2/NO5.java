/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.struktur.data.s2;

/**
 *
 * @author alfa wijaya
 */
public class NO5 {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        for (int a = 0; a < matrix.length; a++){
            for (int b = 0; b < matrix[a].length; b++)
            System.out.println( matrix[a][b]);
        }

        if (isIdentity(matrix)) {
            System.out.println("MATRIX ADALAH MATRIX IDENTITAS.");
        } else {
            System.out.println("MATRIX BUKAN MATRIX IDENTITAS.");
        }
    }

    public static boolean isIdentity(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
