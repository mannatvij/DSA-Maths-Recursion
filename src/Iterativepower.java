public class Iterativepower {
    static int interativepower(int x, int n){
        int result=1;
        while(n>0) {
            if ((n % 2) != 0)
                result *= x; //for even power one
            x = x * x; //for even power, keep on looping.

            n = n / 2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(interativepower(2,3));
    }
}
