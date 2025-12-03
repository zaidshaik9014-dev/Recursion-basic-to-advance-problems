public class recurssion1{
    public static void prntnum(int n){
        if(n==6) return;
        System.out.println(n);
        prntnum(n+1);
    }
    public static void main(String[] agrs){
        int n=1;
        prntnum(n);
    }
}