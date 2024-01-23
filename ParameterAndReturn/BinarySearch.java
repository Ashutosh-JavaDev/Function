package Function.ParameterAndReturn;
import java.util.Scanner;
class Binsearch{
    int biSearch(int arr[],int size,int target,int s,int e){
        if(s>e){
            return -1;
        }
        else{
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                return biSearch(arr, size, target, mid+1, e);
            }
            else{
                return biSearch(arr, size, target, s, mid-1);
            }
        }
    }
}
public class BinarySearch {
    
}
