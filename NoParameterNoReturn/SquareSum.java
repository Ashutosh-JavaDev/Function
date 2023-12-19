package Function.NoParameterNoReturn;
import java.util.*;
public class SquareSum {
    public static int Square(int  number){
        int cal=0,sum=0;
        for(int i=1;i<=number;i++){
            cal=i*i;
            System.out.print(cal+" ");
            sum=sum+cal;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number till the value want to print");
        int number=sc.nextInt();
        int output=Square(number);
        System.out.println("\nOutput: "+output);
    }
}
