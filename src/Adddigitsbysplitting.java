import java.util.Arrays;

public class Adddigitsbysplitting {
    public int minimumSum(int num) {
        int arr[]= new int[4];
        for(int i=0; i<4; i++){
            arr[i]= num%10;
            num= num/10;
        }
        Arrays.sort(arr);
        int sum= ((arr[0]*10+ arr[2]) + (arr[1]*10 + arr[3]));
        return sum;
    }
    public static void main(String[] args) {
        Adddigitsbysplitting obj = new Adddigitsbysplitting();
        System.out.println(obj.minimumSum(4823));
    }
}
