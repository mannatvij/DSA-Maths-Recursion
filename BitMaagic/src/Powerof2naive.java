public class Powerof2naive {
    boolean PowerOf2(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        Powerof2naive p = new Powerof2naive();
        System.out.println(p.PowerOf2(3));
    }

}
