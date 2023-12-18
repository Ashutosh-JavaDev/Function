package Function.NoParameterNoReturn;

import java.util.*;

public class PerfectOrNot {
    public void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not Perfect");
        }
    }
    public static void main(String[] args) {
        PerfectOrNot sanatan=new PerfectOrNot();
        sanatan.check();
    }
}
