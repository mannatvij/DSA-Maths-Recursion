import java.util.Arrays;

public class AnagramNaive {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char a[]= s.toCharArray();
        Arrays.sort(a);
        s= new String(a);
        char b[]= t.toCharArray();
        Arrays.sort(b);
        t= new String(b);
        return (s.equals(t));
    }
    public static void main(String[] args) {
        AnagramNaive a = new AnagramNaive();
        System.out.println(a.isAnagram("abcd", "acbd"));
    }
}
