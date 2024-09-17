public class PrimeFactors {
    static void Primefactors(int n) {
        if(n<=1){
            return ;
        }

        for(int i=2; i*i<=n; i++){
            while (n%i==0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if(n>1)
            System.out.print(n+" ");
    }
    public static void main(String[] args) {
      PrimeFactors F= new PrimeFactors();
        F.Primefactors(20);
    }
}
