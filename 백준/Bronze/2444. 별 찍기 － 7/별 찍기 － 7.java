import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i <= N; i++) {
            System.out.print(" ".repeat(N - i));
            System.out.print("*".repeat(i*2-1));
            System.out.print("\n");
        }
        for (int j = N - 1; j > 0; j--) {
            System.out.print(" ".repeat(N - j));
            System.out.print("*".repeat(j*2-1));
            System.out.print("\n");
        }
    }
}
