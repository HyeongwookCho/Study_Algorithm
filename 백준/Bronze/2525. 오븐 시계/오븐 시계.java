import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int baketime = sc.nextInt();
		
		
		int Alarm = (hour * 60) + minute + baketime;		
		
		if (Alarm >= 24 * 60) {
            Alarm -= 24 * 60;
        }
		
		hour = Alarm / 60;
		minute = Alarm % 60;
	
		System.out.println(hour);		
		System.out.println(minute);		
		
    }
}