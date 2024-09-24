public class PowerofHanoi {
    public static void PowerofHanoi(int n, char A, char B, char C) {
       if(n==1) {
           System.out.println("Move 1 from " + A + "to" + C);
           return;
       }
       PowerofHanoi(n-1, A, C, B);
       System.out.println("Move " +n+ " from " + A + " to" + C);
       PowerofHanoi(n-1, B, C, A);
    }
    public static void main(String[] args) {
        int n = 3;
        PowerofHanoi(n, 'A', 'B', 'C');
    }
}
