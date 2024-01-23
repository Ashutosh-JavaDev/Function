package Function.ParameterAndReturn;
import java.util.Scanner;
class Palindrome{
    void disp(int number,int rev){
        if(number<0){
            return;
        }
        else{
            int num=number;
            int d=num%10;
            rev=rev*10+d;
            disp(number/10,rev);
            if(number==rev){
                System.out.print(number+" ");
            }
            else{
                disp(number/10, rev);
            }
        }
    }
}
public class PalindromeNumber {
    public static void main(String[] args) {
        Palindrome ob=new Palindrome();
        
    }
}
