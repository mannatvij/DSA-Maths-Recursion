public class LiteralPoolInJava {
    public static void main(String[] args) {
        String str1= "I am that";
        String str2= "I am that";
        if(str1==str2){
            System.out.println("Yes"); //here they are equal as same memory is
            // alloacted to both of the strings, which has the same content, both str1 and str2 refers to the same point.


        }
        else{
            System.out.println("No");
        }
        String str3= new String("I am that");
        if(str1==str3){ //this is a false because a new object is created of string 3. therefore both strings are not equal)
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
