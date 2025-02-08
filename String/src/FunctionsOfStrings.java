public class FunctionsOfStrings {
    public static void main(String[] args) {
        String str1= "I love Guruji";
        String str2 = new String("I love Guruji");
        if(str1.equals(str2)){
            System.out.println("The strings are equal");
        }
        else{
            System.out.println("The strings are not equal");
        }
        String str3 = "I love Guruji";
        String str4 = "love";
        if(str3.contains(str4)) {
            System.out.println("The strings are contains");
        }
        else{
            System.out.println("The strings are not contains");
        }
        String str5 = "geeks";
        String str6 = "for";
        int res= str5.compareTo(str6);
        if(res==0) {
            System.out.println("The strings are equal");
        }
        else if(res>0) {
            System.out.println("string is greater");
        }
        else if(res<0) {
            System.out.println("string is less");
        }
       System.out.println(str5.indexOf(str6));
    }

}
