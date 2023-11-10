import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        if(LeapCheck(year))
        {
            System.out.println('1');
        }else{
            System.out.println('0');
        }
    }
    public static boolean LeapCheck(int year){
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
            return true;
        return false;
    }
}