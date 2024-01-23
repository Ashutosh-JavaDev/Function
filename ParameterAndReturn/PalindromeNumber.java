package Function.ParameterAndReturn;

import java.util.Scanner;

class Palindrome {
    int disp(int number, int rev) {
        if (number < 0) {
            return -1;
        } else {
            int num = number;
            int d = num % 10;
            rev = rev * 10 + d;
            return disp(number / 10, rev);
        }
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Palindrome ob = new Palindrome();
        ob.disp(121, 0);
    }
}
