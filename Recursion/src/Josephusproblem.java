public class Josephusproblem {
    static int remainingperson(int n, int k){
        if(n==1)
            return 0;
        else
            return (remainingperson(n-1,k)+k)%n;
    }
    static int josephusproblem(int n, int k){
        return remainingperson(n,k)+1;
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        System.out.println(josephusproblem(n,k));
    }
}
// leetcode problem 1823