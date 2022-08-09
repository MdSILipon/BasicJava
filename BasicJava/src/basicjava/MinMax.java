
package basicjava;

import java.util.Scanner;


public class MinMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int i;
        double[] num = new double[5];
        double sum=0, avg=0;
        System.out.println("Enter 5 numbers: ");
        for ( i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
            sum = sum+num[i];
            avg = sum/num.length;
        }
        System.out.println("Summation = "+sum);
        System.out.println("Average = "+avg);
        
        double max = num[0], min = num[0];
        
        for ( i = 1; i < num.length; i++) {
            if (max<num[i]) {
                max=num[i];
            }
            else if (min>num[i]) {
                min=num[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
