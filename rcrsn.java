import java.util.*;
public class rcrsn{
    public static void print(int n){
        if(n==0) return;
        print(n);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}