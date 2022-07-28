package com.sohmtee;
import java.util.Scanner;

public class Main extends Solve{
    public static int row = 3;
    public static int col = 3;
    public static Scanner sc = new Scanner(System.in);
    public static int mat[][] = new int[row][col];
    public static int operand;

    public static void quest1 (){
        System.out.println("What do you want to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        operand = sc.nextInt();
    }

    public static void quest2(){
        System.out.print("Input matrix: ");

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        quest1();

        if (operand < 1 | operand > 4){
            while (operand < 1 | operand > 4){
                System.out.println();
                System.out.println("Invalid input");
                quest1();
            }
        }

        System.out.println();
        System.out.println("Result");

        printMatrix();
    }
}
