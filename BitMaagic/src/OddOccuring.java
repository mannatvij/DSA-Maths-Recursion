public class OddOccuring {
    int findOddOccurence(int arr[]) {
        for(int i=0; i<arr.length; i++ ) {
            int count=0;
            for(int j=0; j<arr.length; j++ ) {
                if(arr[i]== arr[j]) {
                    count++;
                }
            }
            if(count%2!=0){
                return arr[i];
            }
        }
        return -1;
        }
        public static void main(String[] args) {
        OddOccuring o = new OddOccuring();
        System.out.println(o.findOddOccurence(new int[]{1,1,1,1,2,2,3,4,4,5,5}));
        }
}
