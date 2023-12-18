package Function.NoParameterNoReturn;
import java.util.*;
public class PrimeOrNot {
    public void Check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number=sc.nextInt();
        int c=0;
        for(int i=1;i<=Number;i++){
            if(Number%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not  Prime");
        }
    }
    public static void main(String[] args) {
        PrimeOrNot ob=new PrimeOrNot();
        ob.Check();
    }
}
