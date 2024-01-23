package Function.ParameterAndReturn;
import java.util.Scanner;
class Binsearch{
    int biSearch(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        else{
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                return biSearch(arr, target, mid+1, e);
            }
            else{
                return biSearch(arr, target, s, mid-1);
            }
        }
    }
}
public class BinarySearch {
  public static void main(String[] args) {
    Binsearch ob=new Binsearch();
    int arr[]={22,23,35,56,78};
    int result=ob.biSearch(arr, 22, 0, arr.length-1);
    System.out.println("Result: "+result);

  }   
}
