public class PrimeNo {
    public boolean primeNo(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNo p = new PrimeNo();
        System.out.println(p.primeNo(7)); // true
    }
}
