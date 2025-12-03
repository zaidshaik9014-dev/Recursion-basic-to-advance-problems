import java.util.*;
public class recurssion{
    public static void prntNum(int n){
        if(n==0) return ;
        System.out.println(n);
        prntNum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        prntNum(n);
    }
}
