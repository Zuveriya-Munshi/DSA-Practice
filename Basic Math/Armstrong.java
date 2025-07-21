import java.lang.Math;

public class Armstrong {
    public boolean armstrong(int n) {
        boolean isArm = false;
        int original = n;
        int cnt = (int) Math.log10(n) + 1;
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum = sum + (int) Math.pow(last, cnt);
            n = n / 10;
        }
        if (original == sum) {
            isArm = true;
        }
        return isArm;
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        System.out.println(a.armstrong(153)); // true
    }

}
