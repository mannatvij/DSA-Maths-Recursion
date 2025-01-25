public class Lookupmethod {
    static int table[]= new int[256];
    public static void initialize(){
        table[0]= 0;
        for(int i=0; i<256; i++){
            table[i]= table[i &(i-1)]+1;
        }
    }

    public static int countbits(int n){
        return table[n & 255]+
                table[(n>>8) & 255]
                + table[(n>>16) & 255]
                + table[(n>>24)];
    }
    public static void main(String args[]) {
        initialize();
        int n = 9;
        System.out.println(countbits(n));

    }
}
