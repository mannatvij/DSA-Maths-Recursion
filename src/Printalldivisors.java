public class Printalldivisors {
    static void printalldivisors(int n) {
        if(n<=1)
            return;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                n=n/i;
              
            }
        }
        if(n>1)
            System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printalldivisors(1000);
    }
}
