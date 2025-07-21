public class CountPrimeTillN {
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int primeUptoN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        CountPrimeTillN obj = new CountPrimeTillN();
        System.out.println(obj.primeUptoN(10));

    }

}
