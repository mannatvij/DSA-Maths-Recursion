public class Powerof4LC342 {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if(n>1)
            return (n%4==0 && isPowerOfThree(n/4));
        else
            return false;
    }
    public static void main(String[] args) {
        Powerof4LC342 p = new Powerof4LC342();
        System.out.println(p.isPowerOfThree(424));
    }
}
