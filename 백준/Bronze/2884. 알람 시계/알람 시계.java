import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();		
		
		int totalMinute = (hour * 60) + minute;
		int earlyAlarm = totalMinute - 45;
		
		if (earlyAlarm < 0) {
            earlyAlarm += 24 * 60;
        }
		
		hour = earlyAlarm / 60;
		minute = earlyAlarm % 60;
	
		System.out.println(hour);		
		System.out.println(minute);		
		
    }
}