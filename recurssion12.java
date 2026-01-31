import java.util.*;
public class recurssion12{
    public static void moveAllX(String str,int idx,int count,String newStinrg){
        if(idx == str.length()){
            String result = "";
        for(int i = 0; i < count; i++){
            result += 'x';
        }
        result += newStinrg;
        System.out.println(result);
        return;
    }
        char curChar = str.charAt(idx);
        if(curChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStinrg);
        }else{
            newStinrg += curChar;
            moveAllX(str, idx+1, count, newStinrg); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        moveAllX(str, 0, 0, "");
    }
}
