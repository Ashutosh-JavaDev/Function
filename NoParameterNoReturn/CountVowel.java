package Function.NoParameterNoReturn;

import java.util.*;

public class CountVowel {
    public void vowel() {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter te String");
        String Str = sc.nextLine();
        for (int i = 0; i < Str.length(); i++) {
            if ((Str.equalsIgnoreCase("A")) || (Str.equalsIgnoreCase("E")) || (Str.equalsIgnoreCase("I"))
                    || (Str.equalsIgnoreCase("O")) || (Str.equalsIgnoreCase("U"))) {
                        count++;
            }
        }
        if(count>0){
            System.out.println("Total Vowel:    "+count);
        }
        else{
            System.out.println("No Vowel");
        }
    }
    
}
