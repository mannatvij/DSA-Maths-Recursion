public class IssubsequenceRecursive {
    boolean isSubsequence(String a, String b, int n, int m) {
        if(m==0){
            return true;
        }
        if(n==0){
            return false;

        }
        if(a.charAt(n-1)==b.charAt(m-1)){
            return isSubsequence(a, b, n-1, m-1);
        }
        else {
            return isSubsequence(a, b, n-1, m);
        }

    }
    public static void main(String[] args) {
        IssubsequenceRecursive obj = new IssubsequenceRecursive();
        boolean oo= obj.isSubsequence("abcd", "abchh", 4, 5);
   System.out.println(oo);
    }
}
