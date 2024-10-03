public class PowerofTwo231 {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if(n>1)
            return (n%2==0 && isPowerOfTwo(n/2));
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(new PowerofTwo231().isPowerOfTwo(3));
    }
}
//leetcode 231, maths and recurrsion.
