package arrayofarrays;

import java.util.Arrays;

public class ArrayOfArraysMain {

    static int[][] multiplicationTable(int size) {

        int[][] szorzotabla = new int[size][size];

        for(int i = 0; i < size; i++) {

            for(int j = 0; j < size; j++) {

                szorzotabla[i][j] = (i + 1) * (j + 1);
            }

        }

        return  szorzotabla;
    }

    static void printArrayOfArrays(int[][] a) {

        for(int i = 0; i < a.length; i++) {

            for(int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j]);
                System.out.print(" ");

            }

            System.out.print("\n");
        }

    }

    static int[][] triangularMatrix(int size) {

        int[][] haromszog = new int[size][];

        for (int i = 0; i < size; i++) {

            int[] sor = new int[i +1];

            for (int j = 0; j < i +1; j++) {

                sor[j] = i;
            }

            haromszog[i] = sor;
        }

        return haromszog;


    }


    public static void main(String[] args) {

        int[][] tabla = multiplicationTable(5);
        printArrayOfArrays(tabla);
        printArrayOfArrays(triangularMatrix(4));
    }

}
