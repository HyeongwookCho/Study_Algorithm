import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(X*Y));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
