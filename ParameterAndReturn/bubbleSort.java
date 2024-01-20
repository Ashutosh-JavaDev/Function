package Function.ParameterAndReturn;

class bubSorting {
    void sortingBubble(int arr[], int i, int j, int size) {
        if (size == 1) {
            return;
        } else if (i < size && j < size) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                sortingBubble(arr, i, j + 1, size - 1);
                i++;
                System.out.print(arr[i] + " ");

            } else {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                sortingBubble(arr, i, j + 1, size - 1);
                i++;
                System.out.print(arr[i] + " ");

            }
        }
    }
}

public class bubbleSort {
    public static void main(String[] args) {
        bubSorting ob = new bubSorting();
        int arr[] = { 2, 4, 1, 5, 3 };
        int i=0;
        ob.sortingBubble(arr, i, i+1, arr.length - 1);
    }
}
