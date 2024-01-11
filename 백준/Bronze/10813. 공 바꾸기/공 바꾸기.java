import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 동일한 번호의 공이 든 바구니
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j+1;
        }

        int M = sc.nextInt();
        int temp;

        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            temp = arr[b-1];
            arr[b-1] = arr[a-1];
            arr[a-1] = temp;
        }
        for (int end = 0; end < arr.length; end++) {
            System.out.print(arr[end] + " ");
        }
    }
}