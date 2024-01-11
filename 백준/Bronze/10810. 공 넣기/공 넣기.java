import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for(int i = 0; i < M; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = sc.nextInt();

            for(; a <= b; a++){
                arr[a] = c;
            }
        }
        for (int end = 0; end < arr.length; end++) {
            System.out.print(arr[end] + " ");
        }
    }
}