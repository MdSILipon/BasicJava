
package basicjava;

import java.util.Scanner;


public class MaTrix {
    public static void main(String[] args) {
        //input method
        Scanner input = new Scanner(System.in);
        
        //declare A & B matrix array
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        //user input of A matrix value
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col]=input.nextInt();
            }
        }
        System.out.println();
        //user input of B matrix value
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]=",row,col);
                B[row][col]=input.nextInt();
            }
        }
        
        System.out.println();
        
        //print A & B matrix value
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
        
        System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }
        
        //Summation of A & B matrix
        System.out.println("A+B = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
    }
}
