import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());

        bw.write(Long.toString(a*(a-1)*(a-2)/6)+"\n");
        bw.write(Integer.toString(3));
        br.close();
        bw.flush();
        bw.close();
    }

}