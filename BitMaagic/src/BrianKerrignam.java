import java.util.Scanner;

public class BrianKerrignam {
    static int countbits(int n){
        int count = 0;
        while(n>0){
            n= n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        BrianKerrignam b = new BrianKerrignam();
        System.out.println(b.countbits(7));
    }
}
