package TUF.Arrays;

public class SumOfEle {
    public int sumOfEle(int []arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String arg[]){
        SumOfEle obj = new SumOfEle();
        int[] arr = {1,2,3};
        int n = arr.length;
        System.out.print(obj.sumOfEle(arr,n));
    }
}
