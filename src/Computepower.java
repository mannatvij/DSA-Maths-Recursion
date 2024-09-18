public class Computepower {
    static int computepower(int x, int n){
        int result=1;
        for(int i=0; i<n; i++){
            result= result*x;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(computepower(2,3));
    }
}

