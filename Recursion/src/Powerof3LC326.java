public class Powerof3LC326 {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if(n>1)
            return (n%3==0 && isPowerOfThree(n/3));
        else
            return false;
    }
    public static void main(String[] args) {
        Powerof3LC326 p = new Powerof3LC326();
        System.out.println(p.isPowerOfThree(27));
    }
}
