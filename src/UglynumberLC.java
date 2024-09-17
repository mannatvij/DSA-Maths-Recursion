public class UglynumberLC { // here we simply check if it is divible by all 2,3,5 and in the end if the
    // number is left to one, meaning its prime factors are limited to 2,3,5. making it an ugly nuber.
    public boolean isUgly(int n) {
        if (n < 1)
            return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        UglynumberLC ugly = new UglynumberLC();
        System.out.println(ugly.isUgly(28));
    }
}
