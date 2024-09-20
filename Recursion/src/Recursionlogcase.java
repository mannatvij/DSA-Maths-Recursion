public class Recursionlogcase {
    static int fun(int n) {
        if (n == 1)
            return 0;
        else return 1+fun(n/2);
    }
    public static void main(String[] args) {
        System.out.println(fun(16));
    }
}
// this program prints the result of log base 2 n.