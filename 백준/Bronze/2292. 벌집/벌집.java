import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 1;

        while (N > range) {
            range += count * 6;
            count++;
        }



        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }

}
