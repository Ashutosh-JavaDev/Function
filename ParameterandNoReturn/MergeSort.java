package Function.ParameterandNoReturn;

import java.util.Scanner;

class merge {
    public static void mergeSort(int arr[], int first, int last) {
        int mid = first + (last - first) / 2;
        int k[] = new int[first + last];
        int total = first + last;
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
        for (int l = 0, m = 0; l <= total; l++, m++) {
            k[l] = arr[m];
        }
        System.out.println("Sorted Array");
        System.out.print(k + " ");
    }

    public static void recur(int arr[], int s, int l) {
        if (s < l) {
            int mid = s + (l - s) / 2;
            recur(arr, s, mid);
            recur(arr, mid + 1, l);
            mergeSort(arr, s, l);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        merge ob = new merge();
        int arr[] = { 7, 3, 2, 5, 9, 10 };
        ob.recur(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
