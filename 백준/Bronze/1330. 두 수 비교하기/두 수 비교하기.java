import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        int a = sc.nextInt();
        int b = sc.nextInt();        
        String sign;
        
        if(a == b) sign = "==" ;
        else sign = (a > b) ? ">" : "<";                             
        System.out.println(sign);
    }
}