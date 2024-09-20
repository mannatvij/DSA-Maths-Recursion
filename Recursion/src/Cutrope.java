public class Cutrope {
    static int cutrope(int n, int a, int b, int c) {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
      int res1= cutrope(n-a,a,b,c);
      int res2= cutrope(n-b,a,b,c);
      int res3= cutrope(n-c,a,b,c);
      int result= Math.max(res1,Math.max(res2,res3));
      if(result==-1)
          return -1;
      return result+1;
    }
    public static void main(String[] args) {
        System.out.println(cutrope(6,2,3, 4));
    }
}
//yay! did it!