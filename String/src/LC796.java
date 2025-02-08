public class LC796 {
    public boolean rotateString(String s, String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        s= s+s;
        int n= s.length();
        int m= goal.length();
        int j=0;
        for(int i=0; i<n && j<m; i++){
            if(s.charAt(i)== goal.charAt(j)){
                j++;
            }
            else{
                j=0;
            }
        }
        return s.contains(goal);
    }
    public static void main(String[] args) {
        LC796 lc796 = new LC796();
        System.out.println(lc796.rotateString("abcd", "cdba"));
    }
}
