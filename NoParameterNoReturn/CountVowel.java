package Function.NoParameterNoReturn;

import java.util.*;

public class CountVowel {
    public void vowel() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String"); // Fixed typo in the message
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i)); // Convert to uppercase for case-insensitive comparison
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Total Vowel: " + count);
        } else {
            System.out.println("No Vowel");
        }
    }

    public static void main(String[] args) {
        CountVowel ob = new CountVowel();
        ob.vowel();
    }
}
