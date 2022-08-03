
package basicjava;

import java.util.Scanner;


public class PalindromNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter any positive number: ");
        int num = input.nextInt();
        
        int temp=num, sum=0, r;
        
        while(temp!=0){
            r = temp % 10;
            sum = sum*10+r;
            temp=temp/10;
        }
        System.out.print("Reverse number: "+sum);
        System.out.println(" ");
        if(num==sum){
            System.out.println("This is Palindrom Number.");
        }else
            System.out.println("Not Palindrom.");
        
    }
}
