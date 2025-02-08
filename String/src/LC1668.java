public class LC1668 {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String add= word;
        while(sequence.contains(word)== true){
            count++;
            word= word+add;
        }
        return count;
    }
public static void main(String[] args) {
        LC1668 lc1668 = new LC1668();
        System.out.println(lc1668.maxRepeating("abababcd", "ab"));
}
}
