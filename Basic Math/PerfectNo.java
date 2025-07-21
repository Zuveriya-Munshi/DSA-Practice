public class PerfectNo {
    public boolean perfectNo(int n) {
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return (n == sum);

    }

    public static void main(String[] args) {
        PerfectNo p = new PerfectNo();
        System.out.println(p.perfectNo(28)); // true
    }
}
