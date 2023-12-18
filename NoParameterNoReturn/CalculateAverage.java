package Function.NoParameterNoReturn;
import java.util.*;
public class CalculateAverage {
    public void average(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total value of the number wats to take average");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        float average=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum:    "+sum);
        average=(float)sum/size;
        System.out.println("Average:    "+average);
    }
    public static void main(String[] args) {
        CalculateAverage ob=new CalculateAverage();
        ob.average();
    }
}
