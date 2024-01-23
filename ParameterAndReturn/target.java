package Function.ParameterAndReturn;

import java.util.Scanner;
class TargetNumber{
    int disp(int arr[],int size,int target){
        if(size<0){
            return -1;
        }
        else if(arr[size]==target){
            return size;
        }
        else{
            return disp(arr, size-1, target);
        }
    }
}
public class target {
    public static void main(String[] args) {
        TargetNumber ob=new TargetNumber();
        int arr[]={2,4,12,42,45};
        int result=ob.disp(arr, arr.length-1, 4);
        System.out.println("Result: "+result);
    }
}
