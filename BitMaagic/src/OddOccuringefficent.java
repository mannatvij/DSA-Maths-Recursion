public class OddOccuringefficent {
    int oddoccuring(int arr[]){
        int n=arr.length;
        int res= arr[0];
        for(int i=1;i<n;i++){
            res= res^arr[i];
        }
        return res;
    }
    public static void main(String args[]){
        OddOccuringefficent ob = new OddOccuringefficent();
        System.out.println(ob.oddoccuring(new int[]{1,1,1,2,3,4,5,2,3,4,5}));
    }

}
