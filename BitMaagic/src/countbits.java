import java.util.Arrays;

public class countbits {
    int [] Count(int n){
        int arr[]= new int[n+1];
        for(int i=0; i<=n; i++){
            int count=0;
            int num=i;
            while (num > 0) {

                num= num & (num-1);
                count++;
            }
            arr[i]=count;
        }
        return arr;
    }
    public static void main(String args[]){
        countbits obj = new countbits();
        int n=4;
      int arr[]=   obj.Count(n);
      System.out.println(Arrays.toString(arr));
    }


}
