package Function.ParameterAndReturn;

class BubSorting {
    void sortingBubble(int arr[], int i, int j, int size) {
        if (size == 1 || i >= size-1) {
            return;
        } else if (j < size-1-i) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sortingBubble(arr, i, j + 1, size);
        } else {
            sortingBubble(arr, i+1, 0, size);
        }
    }
}

public class bubbleSort {
    public static void main(String[] args) {
        BubSorting ob = new BubSorting();
        int arr[] = { 2, 4, 1, 5, 3 };
        int i = 0;
        ob.sortingBubble(arr, i, i + 1, arr.length);
        
        // Print the sorted array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
