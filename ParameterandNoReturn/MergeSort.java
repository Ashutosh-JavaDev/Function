package Function.ParameterandNoReturn;

import java.util.Scanner;

class merge {
    public static void mergeSort(int arr[], int size, int first, int last) {
        int mid = first + (last - first) / 2;
        int k[] = new int[first + last];
        int total=first+last;
        int s = 0;
        int i = first;
        int j = mid + 1;
        while (i <= mid && j <= last) {
            if (arr[i] <= arr[j]) {
                k[s] = arr[i];
                s++;
                i++;
            } else {
                k[s] = arr[j];
                s++;
                j++;
            }
        }
        while (i <= mid) {
            k[s] = arr[i];
            i++;
            s++;
        }
        while (j <= last) {
            k[s] = arr[j];
            s++;
            j++;
        }
        for(int l=0,m=0;l<=total;l++,m++){
            k[l]=arr[m];
        }
        System.out.println("Sorted Array");
        System.out.print(k+" ");
    }
}

public class MergeSort {

}
