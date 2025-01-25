public class Kthbit1 {
    static boolean Kthbitset(int n, int k){
        int x= 1<< k-1;
        if((n & x)!=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Kthbit1 obj = new Kthbit1();

        boolean kthbitset = Kthbitset(5, 3);
        System.out.println(kthbitset);
    }
}
