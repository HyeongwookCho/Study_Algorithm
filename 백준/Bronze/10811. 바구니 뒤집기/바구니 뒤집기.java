import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int i = 0;
        int j = 0;
        int temp = 0;

        int[] arr = new int[N];
        for (int sep = 0; sep < arr.length; sep++) {
            arr[sep] = sep + 1;
        }

        for (int rep = 0; rep < M; rep++) {
            i = sc.nextInt()-1;
            j = sc.nextInt()-1;

            for (; i < j; i++, j--) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int q = 0; q < arr.length; q++) {
            System.out.print(arr[q] + " ");
        }
    }
}