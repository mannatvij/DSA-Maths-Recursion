public class Reversebits {
    public int reverseBits(int n) {

        int result=0;
        for(int i=0; i< 32; i++){
            result= result<<1;
            int last= (n & 1);
            result= result+last;
            n= n>>1;
        }
        return result;
    }
    public static void main(String[] args) {
        Reversebits rb = new Reversebits();
        System.out.println(rb.reverseBits(32));
    }
}
