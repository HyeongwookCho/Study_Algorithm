import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        // (x의 최대값 - x의 최소값) * (y의 최대값 - y의 최소값) = 면적
        Arrays.sort(x);
        Arrays.sort(y);

        result = (x[0] - x[x.length-1]) * (y[0] - y[y.length-1]);

        bw.write(Integer.toString(result));

        br.close();
        bw.flush();
        bw.close();
    }
}