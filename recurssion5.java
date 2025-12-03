import java.util.*;
public class recurssion5{
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownm1=calPower(x, n-1);
        int xpown=x*xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), n=sc.nextInt();
        int ans=calPower(x, n);
        System.out.println(ans);
    }
}

