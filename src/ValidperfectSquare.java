public class ValidperfectSquare {
        public boolean isPerfectSquare(int num) {
            if (num==1){
                return true;
            }
            long start=0;
            long end= num;
            while(start<=end){
                long mid= (start+end)/2;
                if(mid*mid==num) return true;
                else if(mid*mid < num)
                    start= mid+1;
                else end= mid-1;
            }
            return false;
        }

public static void main(String[] args) {
            ValidperfectSquare obj = new ValidperfectSquare();
            System.out.println(obj.isPerfectSquare(16));
}
    }