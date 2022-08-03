package basicjava;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter upto three digits number: ");
        int num=input.nextInt();
        
        int temp=num, sum=0, r;
        
        while(temp!=0){
            
            r= temp%10;
            sum = sum + r;
            temp=temp/10;
        }
        System.out.println(" ");
        System.out.print("Sum of digits:"+sum);
        System.out.println(" ");
    }
}
