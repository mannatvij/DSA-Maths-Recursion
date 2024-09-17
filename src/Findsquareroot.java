public class Findsquareroot { //Leetcode problem 69.
        public int mySqrt(int x) {
            int start=0;
            int end= x;
            int result=0;

            while(start<=end){
                int mid= start+ (end-start)/2; // to avoid overflow we write this condition.
                long square = (long) mid * mid;
                if(square== x){
                    return mid;
                }
                else if (square <x){
                    start= mid+1;
                    result=mid;
                }
                else {
                    end = mid-1;
                }
            }
            return result;
        }
    }

