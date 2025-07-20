
public class ReveseNo {
    public int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReveseNo r = new ReveseNo();
        System.out.println(r.reverseNumber(1234));

    }
}
