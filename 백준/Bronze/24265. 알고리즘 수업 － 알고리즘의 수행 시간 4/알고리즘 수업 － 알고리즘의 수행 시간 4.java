import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());

        bw.write(Long.toString((long) (Math.pow(a,2)/2) - (a/2))+"\n");
        bw.write(Integer.toString(2));
        br.close();
        bw.flush();
        bw.close();
    }

}