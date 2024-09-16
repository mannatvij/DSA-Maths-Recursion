public class Trailingzerosinfactorial {
    static int trailingzerosinfactorial(int n) {
        int result = 0;
        for(int i=5; i< n; i=i*5){ // here by 5 as (2 and 5 makes 10) and 5 occurs less, therefore more chance/
            result = result + n/i; // here n/i as min number of zeros possible will be these,

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(trailingzerosinfactorial(251));
    }
    }

