package TUF.Arrays;

public class CountOddFromArray {
    public int countOddEle(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String arg[]) {
        CountOddFromArray obj = new CountOddFromArray();
        int[] arr = { 1, 2, 1, 3 };
        int n = arr.length;
        System.out.print(obj.countOddEle(arr, n));
    }
}
