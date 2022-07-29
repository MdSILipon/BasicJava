
package basicjava;

import java.util.Scanner;


public class FarToCel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float  f, c;
        
        System.out.print("Enter farenhite: ");
        
        f = input.nextFloat();
        
        c = (float) (0.56 * f - 32);
        
        System.out.println("Temp in Celsius: " + c);
        
        
        
    }
    
}
