
class Palindrome {
    public boolean palindrome(int n) {
        int original = n;
        boolean isPalin = false;
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n /= 10;
        }
        if (original == rev) {
            isPalin = true;
        }
        return isPalin;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.palindrome(121);

    }
}