
package basicjava;

import java.util.Scanner;


public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter any positive number: ");
        int num = input.nextInt();
        
        int temp=num, sum=0, r;
        
        while(temp!=0){
            r = temp % 10;
            sum = sum+r*r*r;
            temp=temp/10;
        }
        System.out.print("Sum of digits: "+sum);
        System.out.println(" ");
        if(num==sum){
            System.out.println("This is Armstrong Number.");
        }else
            System.out.println("Not Armstrong.");
        
    }
}
