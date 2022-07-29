
package basicjava;

import java.util.Scanner;

public class FiboNum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you input: ");
        int num = input.nextInt();
        
        int first=0;
        int scnd=1;
        
        System.out.print(first+" "+scnd);
        
        for (int i = 3; i <= num; i++) {
            
            int fibo=first+scnd;
            System.out.print(" "+fibo+);
            first=scnd;
            scnd=fibo;
            
        }
    }
    
}
