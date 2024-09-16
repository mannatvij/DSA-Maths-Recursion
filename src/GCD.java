public class GCD {
    static int gcd(int a, int b) {
        int result= Math.min( a, b);
        while( result>0){
            if(a%result==0 && b%result==0){
                return result;
            }
            else result--;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(gcd(6,2));
    }
}
