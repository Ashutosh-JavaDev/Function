package Function.ParameterAndReturn;
class bubSorting{
    void sortingBubble(int arr[],int i,int j,int size){
        if(size==1){
            return;
        }
        else{
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                sortingBubble(arr, i, j+1, size-1);
            }
            else{
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                sortingBubble(arr, i, j+1, size-1);
            }
        }
        System.out.print(arr[i]+" ");
    }
}
public class bubbleSort {
    
}
