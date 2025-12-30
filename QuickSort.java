public class QuickSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int arr[], int si, int en) {
        if (si >= en) {
            return;
        }
        int pidx = partition(arr, si, en);
        Sort(arr, si, pidx - 1);
        Sort(arr, pidx + 1, en);
    }

    public static int partition(int arr[], int si, int en) {
        int pivot = arr[en];
        int i = si - 1;
        for (int j = si; j < en; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[en] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 ,6};
        Sort(arr, 0, arr.length - 1);
        print(arr);
    }
}
