package Function.ParameterAndReturn;

import java.util.Scanner;

class Palindrome {
    int disp(int number, int rev) {
        if (number <=0) {
            return rev;
        } else {
            int d = number % 10;
            rev = rev * 10 + d;
            return disp(number / 10,rev);
        }
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc.nextInt();
        Palindrome ob = new Palindrome();
       int result= ob.disp(number, 0);
       if(result==number){
        System.out.println("Number is Palindrome");
       }
       else{
        System.out.println("Number Is not Palindrome");

       }
    }
}
