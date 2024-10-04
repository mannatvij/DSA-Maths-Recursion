import java.util.Arrays;

public class SieveOfparentheses {
    static void sieve(int n) {
        if (n <= 1)
            return;
        boolean isPrime[] = new boolean[n + 1]; // create a new array of size n +1

        Arrays.fill(isPrime, true); // fill it.
        for (int i = 2; i * i <= n; i++) { // its factors will always be less than square of it.
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j = j + i) { // minus out multiplies of 2, then 3 then 5.
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        sieve(10);
    }
}
