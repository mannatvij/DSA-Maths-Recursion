public class Frequenciesofchar {
    public static void main(String[] args) {
        String str= "geeksforgeeks";
        int count[]= new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - 'a']++; //stored g at its index only at 6, got that by this formula. so that automatically in the count array,
            // the alphabets are in its right index only.
        }
        for(int i=0; i<26; i++){ //now iterating in count array, we print, char. and its count.
            if(count[i]>0){
                System.out.println((char)(i+'a') + " "+ count[i]);
            }
        }
    }
}
