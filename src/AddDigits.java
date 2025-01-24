//leetcode 258

public class AddDigits {
    public int addDigits(int num) {
        if(num>=0 && num<10){
            return num;
        }
        int result= (num-1)%9 +1;
        return result;
    }
    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(19));
    }
}
