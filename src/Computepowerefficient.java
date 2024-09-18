public class Computepowerefficient {
    static int Computepowereff(int x, int n) {
        if (n==0) {
            return 1;
        }
            int temp= Computepowereff(x,n/2);
            temp= temp*temp;
            if(n%2==0)
                return temp;
            else
                return temp*x;
        }

        public static void main(String[] args) {
        System.out.println(Computepowereff(2,3));
        }
    }
