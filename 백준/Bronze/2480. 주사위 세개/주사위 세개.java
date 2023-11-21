import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int result;
		
		if(x == y && y == z)
		{
			result = 10000 + (x * 1000);
		}
		else if(x == y || x == z)
		{
			result = 1000 + (x * 100);
		}
		else if(y == z)
		{
			result = 1000 + (y * 100);
		}
		else
		{
			List<Integer> numbers = List.of(x,y,z);
			int max = numbers.isEmpty() ? -1 : Collections.max(numbers);
			result = max * 100;			
		}			

		System.out.println(result);		
    }
}