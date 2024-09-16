public class LCMusingeucleadian {
    static int GCD(int a, int b) {
        if(b==0){
            return a;
        }
        else return GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return (a*b)/GCD(a,b);
        }
        public static void main(String[] args) {
        System.out.println(LCM(3,18));
        }
    }

