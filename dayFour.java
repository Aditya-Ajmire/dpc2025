
import java.util.Arrays;

public class dayFour {

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = nextGap(m + n);

        while (gap > 0) {
            int i = 0, j = 0;

            // Compare elements in arr1
            while (i + gap < m) {
                if (arr1[i] > arr1[i + gap]) {
                    swap(arr1, i, i + gap);
                }
                i++;
            }

            // Compare elements between arr1 and arr2
            j = gap > m ? gap - m : 0;
            i = i < m ? i : m;
            while (i < m && j < n) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                i++;
                j++;
            }

            // Compare elements in arr2
            if (j < n) {
                j = 0;
                while (j + gap < n) {
                    if (arr2[j] > arr2[j + gap]) {
                        swap(arr2, j, j + gap);
                    }
                    j++;
                }
            }

            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
