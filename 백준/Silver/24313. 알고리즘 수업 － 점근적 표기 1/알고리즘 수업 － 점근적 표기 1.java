import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // f(n) <= c*g(n) 를 만족해야함
        // f(n) = a1*n + a0
        int fn = a1*n0 + a0;
        int gn = n0;

        if (fn <= c * gn && c >= a1) {
            bw.write("1");
        } else{
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}