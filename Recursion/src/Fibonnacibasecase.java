public class Fibonnacibasecase {
    static int fib(int n) {
        if(n<=0)
            return n;
        return fib(n-1) +fib(n-2);
    }
    public static void main(String[] args) {

    }
}
