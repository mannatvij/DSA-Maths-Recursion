// for(int i=2;i<n;i++)
// if (n%i== 0)
// return false.
// else true.

public class Prime {
    boolean isPrime(int n) {
        if(n==1)
            return false;
        if (n==2 || n==3)
            return true;
        if(n%2==0 && n%3==0)
            return false;
        for(int i=5; i*i<=n; i=i+6){ // here we start with 5, as others covered, and next through +6,
            // it compares with n%i and i%i+2 for easy calculation
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}

