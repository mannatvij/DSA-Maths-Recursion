public class OddOccuring2Efficent {
    static void oddAppearing(int arr[], int n)
    {
        int xor = 0, res1 = 0, res2 = 0;

        for (int i = 0; i < n; i++)
            xor = xor ^ arr[i];


        int sn = xor & (~(xor - 1));



        for (int i = 0; i < n; i++)
        {
            if ((arr[i] & sn) != 0) //last bit 0
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i]; //last bit odd ones.
        }


        System.out.println( res1 + " " + res2);

    }
    public static void main (String[] args) {

        int arr[]= {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;

        oddAppearing(arr, n);
    }
}
