public class shownumbers {
    static void PrintNumbers(int n) {
        if(n==0)
            return;
        PrintNumbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        PrintNumbers(5);
    }

}