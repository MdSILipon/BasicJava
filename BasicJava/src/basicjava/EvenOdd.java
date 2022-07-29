
package basicjava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Enter any integer number: ");
        n = input.nextInt();
        
        if(n%2==0){
            System.out.printf(" %n is Even", n);
        }else{
            System.out.printf(" %n is Odd", n);
        }
    }
}
