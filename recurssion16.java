import java.util.*;
public class recurssion16 {
    public static int placeTiles(int n, int m) {
        if(n==m) {
            return 2;
        }

        if(n<m) {
            return 1;
        }
        //vertically
        int verPlacements = placeTiles(n-m, m);

        //horizontally
        int horPlacements = placeTiles(n-1, m);

        return verPlacements+horPlacements;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and m values: ");
        int n = sc.nextInt(), m= sc.nextInt();
        System.out.println(placeTiles(n, m));
    }
}