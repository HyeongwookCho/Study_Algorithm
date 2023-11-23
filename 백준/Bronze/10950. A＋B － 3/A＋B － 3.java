import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            queue.add(A);
            queue.add(B);
        }

        for(int j = 0; j < T; j++)
        {
            int sum = queue.poll() + queue.poll();
            System.out.println(sum);
        }
    }
}
