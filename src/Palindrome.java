public class Palindrome {
    boolean isPalindrome(int n) {
        int number=n; // here we do this, if as only n, then when the number becomes zero, the return
        // value will always be true. therefore, we store its value in a variable.
        int rev=0;
        while(n>0){
            rev= rev*10 + n%10;
            n= n/10;
        }
        return rev==number;
    }
    public static void main(String[] args) {
      Palindrome p= new Palindrome();
      System.out.println(p.isPalindrome(10));
      System.out.println(p.isPalindrome(101));
    }
}
