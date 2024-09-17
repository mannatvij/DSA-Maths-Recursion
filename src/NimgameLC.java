public class NimgameLC {
    boolean Nimgame(int n){
        if(n<=3)
            return true;
         else return (n%4!=0);
    }
    public static void main(String[] args) {
        NimgameLC obj = new NimgameLC();
        System.out.println(obj.Nimgame(5));
    }
}
