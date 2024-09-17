public class LCM {
    static int LCM(int a, int b) {
        int result= Math.max(a,b);
        while(result>0) {
            if ((result % a == 0) && ( result % b == 0))
                return result;
            else {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(LCM(3,4));
    }

}
