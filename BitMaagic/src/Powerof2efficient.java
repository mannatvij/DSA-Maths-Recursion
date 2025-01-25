public class Powerof2efficient {
    boolean PowerOf2(int n) {
        if(n == 0)
            return false;

        return ((n & (n - 1)) == 0);
    }
    public static void main(String[] args) {
        Powerof2efficient p = new Powerof2efficient();
        System.out.println(p.PowerOf2(1));
    }
}
