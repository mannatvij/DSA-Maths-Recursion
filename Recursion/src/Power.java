public class Power { //leetcode 50
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        // Handle negative exponents
        long N = n; // Convert to long to handle Integer.MIN_VALUE safely
        if (N < 0) {
            x = 1 / x;
            N = -N; // Use long to avoid overflow
        }
        if(n==1){
            return x;
        }
        double temp= myPow(x, (int) (N / 2));

        if
        (N%2==0){ // handle even power
            temp= temp*temp;
            return temp;
        }
        else{
            return temp*temp*x; //handle odd power.
        }
    }
    public static void main(String args[]){
        Power p = new Power();
        System.out.println(p.myPow(2.0, 3));
    }

}
