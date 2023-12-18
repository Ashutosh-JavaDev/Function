package Function.NoParameterNoReturn;
import java.util.*;
public class PerfectSquareOrNot {
    public void Check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Square Number");
        int number=sc.nextInt();
        int c=0;
        for(int i=1;i<=number/3;i++){
            if(i*i==number){
                c++;
            }
        }
        if(c>0){
            System.out.println("Number is Perfect Square");

        }
        else{
            System.out.println("NNumber is Not a Perfect Square");
        }
    }
    public static void main(String[] args) {
        
    }
}
