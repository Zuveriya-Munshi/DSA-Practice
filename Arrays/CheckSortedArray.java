package TUF.Arrays;

public class CheckSortedArray {
    public boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String arg[]) {
        CheckSortedArray obj = new CheckSortedArray();
        int[] arr = { 1, 2, 3 };
        int n = arr.length;
        System.out.print(obj.arraySortedOrNot(arr, n));

    }
}
