
package basicjava;

import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b;
        int sum = 0;
        
        System.out.println("Enter number:");
        a = input.nextInt();
        System.out.println("Enter number:");
        b = input.nextInt();
        
        
        for (int i = a; i <= b; i = i + 2) {
                             //Sum of Odd Numbers
                sum = sum +i;
                System.out.println(i);
        
        
    }
    System.out.println("Sum = " + sum);
}

}

