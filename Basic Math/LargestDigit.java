public class LargestDigit {
    public int largestDigit(int n) {
        int largest = 0;
        while (n > 0) {
            int last = n % 10;
            if (last > largest) {
                largest = last;
            }
            n /= 10;
        }
        return largest;
    }

    public static void main(String args[]) {
        LargestDigit ld = new LargestDigit();
        System.out.println(ld.largestDigit(983981));
    }
}
