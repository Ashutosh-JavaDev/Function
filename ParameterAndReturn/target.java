package Function.ParameterAndReturn;

import java.util.Scanner;
class TargetNumber{
    int disp(int arr[],int size,int target){
        if(size<0){
            return 0;
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

}
