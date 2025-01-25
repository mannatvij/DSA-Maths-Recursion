public class Kthbit2 {
    static boolean kthbit2( int n, int k) {
        int x= (n>> k-1);
        if((1 & x)!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Kthbit2 obj = new Kthbit2();
        System.out.println(obj.kthbit2(5, 3));
    }
}
