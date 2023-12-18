package Function.NoParameterNoReturn;
import java.util.*;

public class Factorial {
    public void Fact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number"); // Fixed typo in the message
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Fact: " + fact); // Fixed typo in the message
    }

    public static void main(String[] args) {
        Factorial ob = new Factorial();
        ob.Fact();
    }
}
