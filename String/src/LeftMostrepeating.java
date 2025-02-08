public class LeftMostrepeating {
    static final int CHAR= 256;
    static int Leftmost(String str){
        int count[]= new int[CHAR];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }

}
