public class ConcatenateStrings {
    public static void main(String[] args) {
        String s1= "Mannat";
        String s2= s1;
        s1= s1 + "vij"; // in concatenation of strings a new object is created therefore they are not equal.


        System.out.println(s1);
        if(s1==s2){
            System.out.println("same");
        }
        else
            System.out.println("different");

    }
}
