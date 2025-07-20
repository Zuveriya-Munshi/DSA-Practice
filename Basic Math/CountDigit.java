
public class CountDigit {
    public int countDigit(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigit cd = new CountDigit();
        cd.countDigit(1234);

    }

}
