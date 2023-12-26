package Function.NoParameterNoReturn;
import java.util.*;
public class odd {
    public static void oddnumber(int arr[],int size){
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output:");
        oddnumber(arr, size);
    }
}
