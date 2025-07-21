public class Factorial {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(5));
    }
}
