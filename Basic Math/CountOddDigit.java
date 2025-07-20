
public class CountOddDigit {
    public int countDigit(int num) {
        int count = 0;
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            int last = num % 10;
            num /= 10;
            boolean isOdd = last % 2 != 0;

            if (isOdd)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountOddDigit cd = new CountOddDigit();
        cd.countDigit(1234);

    }

}
