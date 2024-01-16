import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum = 0;
        String[] arr = s.split("");
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(Integer.toString(sum));
        br.close();
        bw.flush();
        bw.close();
    }
}