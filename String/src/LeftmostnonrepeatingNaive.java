import java.util.Scanner;
public class LeftmostnonrepeatingNaive {
    static final int CHAR= 256;
    static int leftmost(String str){
        int count[]= new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LeftmostnonrepeatingNaive l = new LeftmostnonrepeatingNaive();
        System.out.println(l.leftmost("aabcd"));
    }
}
