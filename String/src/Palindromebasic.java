public class Palindromebasic {
    boolean isPalindrome(String str) {
        StringBuilder rev= new StringBuilder(str);
        rev.reverse();
     return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        Palindromebasic p = new Palindromebasic();
        System.out.println(p.isPalindrome("abba"));
    }
}
