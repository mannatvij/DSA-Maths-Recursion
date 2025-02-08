public class IssubsequenceIterative {
    public boolean isSubsequence(String s, String t) {
        int n= s.length();
        int m= t.length();
        int j=0;
        if(m<n){
            return false;
        }
        for(int i=0; i<m & j<n; i++){
            if(t.charAt(i)== s.charAt(j)){
                j++;
            }
        }
        return (j==n);
    }
    public static void main(String[] args) {
        IssubsequenceIterative is = new IssubsequenceIterative();
        System.out.println(is.isSubsequence("ab", "abcd"));
    }
}
