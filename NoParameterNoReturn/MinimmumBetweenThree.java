package Function.NoParameterNoReturn;

import java.util.*;

public class MinimmumBetweenThree {
    public void minimum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if((num1<num2) && (num1<num3)){
            System.out.println(num1+" is Smallest");
        }
        else if((num2<num1)&&(num2<num3)){
            System.out.println(num2+" is Smallest");
        }
        else{
            System.out.println(num3+" is Smallest");
        }

    }
    public static void main(String[] args) {
        MinimmumBetweenThree ob=new MinimmumBetweenThree();
        ob.minimum();
    }
}
