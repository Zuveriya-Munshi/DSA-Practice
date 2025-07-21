package TUF.Arrays;

public class ReverseArray {
    public void reverse(int[] arr, int n) {
        int left = 0, rigth = n - 1;
        while (left < rigth) {
            int temp = arr[left];
            arr[left] = arr[rigth];
            arr[rigth] = temp;
            left++;
            rigth--;
        }
    }

    public static void main(String arg[]) {
        ReverseArray obj = new ReverseArray();
        int[] arr = { 1, 2, 3 };
        int n = arr.length;
        obj.reverse(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}
