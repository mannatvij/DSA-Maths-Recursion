public class Factorial {
    static int factorial(int n) {
        int fact=1;
        for(int i=2; i<n; i++){
            fact= fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Factorial f= new Factorial();
        System.out.println(f.factorial(5));
        int n=6;
        System.out.println(factorial(n));
    }
}
