import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[] baskets = new int[N];
        for (int k = 0; k < N; k++) {
            baskets[k] = k + 1;
        }

        for (int m = 0; m < M; m++) {
            String[] range = br.readLine().split(" ");
            int i = Integer.parseInt(range[0]) - 1;
            int j = Integer.parseInt(range[1]) - 1;
            reverseArray(baskets, i, j);
        }

        for (int num : baskets) {
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
