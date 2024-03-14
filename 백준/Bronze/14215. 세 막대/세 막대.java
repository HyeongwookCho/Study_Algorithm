import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = GetTriangleMaxRound(a, b, c);

        bw.write(Integer.toString(result));
        br.close();
        bw.flush();
        bw.close();
    }

    private static int GetTriangleMaxRound(int a, int b, int c) {
        int round = 0;
        int[] arr = {a, b, c};

        Arrays.sort(arr);

        a = arr[0];
        b = arr[1];
        c = arr[2]; // 가장 큰 변의 길이

        if (c < a + b) {
            round = a + b + c;
        } else if (c >= a + b) {
            round = a + b + (a + b - 1);
        } else if (a==b && b==c) {
            round = a*3;
        }
        return round;
    }
}