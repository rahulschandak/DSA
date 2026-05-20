import java.util.Arrays;

class BubbleSort {

    private static int[] mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSortHelper(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSortHelper(arr, low, mid);
        mergeSortHelper(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int i = low;       // left half pointer
        int j = mid + 1;   // right half pointer
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}