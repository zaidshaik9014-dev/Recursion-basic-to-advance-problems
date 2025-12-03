import java.util.*;
public class recurssion6{
    public static int calpow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            return calpow(x, n/2)*calpow(x, n/2);
        }else{ //n is odd
            return calpow(x, n/2)*calpow(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt(),n=sc.nextInt();
        int ans = calpow(x, n);
        System.out.println(ans);
    }
}