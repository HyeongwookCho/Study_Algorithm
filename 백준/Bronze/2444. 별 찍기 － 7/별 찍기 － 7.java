import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            bw.write(" ".repeat(N - i));
            bw.write("*".repeat(i * 2 - 1));
            bw.write("\n");
        }
        for (int j = N - 1; j > 0; j--) {
            bw.write(" ".repeat(N - j));
            bw.write("*".repeat(j * 2 - 1));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
