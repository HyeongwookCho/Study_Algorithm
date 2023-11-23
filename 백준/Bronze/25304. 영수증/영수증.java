import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    public static int priceSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();
        Queue<Integer> bill = new LinkedList<>();

        for(int i = 0; i < count; i++)
        {
            bill.add(sc.nextInt());
            bill.add(sc.nextInt());
        }
        for(int j = 0; j < count; j++)
        {
            priceSum += bill.poll() * bill.poll();
        }
        if(priceSum == total) System.out.println("Yes");
        else System.out.println("No");

    }
}
