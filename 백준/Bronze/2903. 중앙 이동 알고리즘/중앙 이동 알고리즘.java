import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int temp = 2;

        int T = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < T; i++) {
            temp = (temp + (temp -1));
            result = temp*temp;
        }

        bw.write(Integer.toString(result));
        br.close();
        bw.flush();
        bw.close();
    }

}
