public class Countsetbitsnaive {
    public int hammingWeight(int n) {
        int count =0;
        while(n>0){
            if(n%2!=0){
                count++;

            }
            n=n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        Countsetbitsnaive c = new Countsetbitsnaive();
        System.out.println(c.hammingWeight(6));
    }
}
