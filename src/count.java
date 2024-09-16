public class count {
   static int count(int x){
        int result=0;
        while(x>0){
            x= x/10;
            result++;
        }
        return result;
    }
 public static void main(String args[]){
        int number =3421;
        System.out.println(count(number));
 }
}
