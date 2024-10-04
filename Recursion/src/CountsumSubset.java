 class CountsumSubset {
     static int countsub(int arr[], int n, int sum) {
         if (n == 0)
             return (sum == 0) ? 1 : 0; //checking that if sum is zero return the count.
         return countsub(arr, n - 1, sum) + countsub(arr, n - 1, sum - arr[n - 1]); //we subratact sum from the index, to see if the sum turns out to be zero.
     }

     public static void main(String args[]) {
         int n = 3, arr[] = {10, 20, 15}, sum = 25;
         System.out.println(countsub(arr, n, sum));
     }
 }
