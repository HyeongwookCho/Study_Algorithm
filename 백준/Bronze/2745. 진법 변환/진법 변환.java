import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //알파벳 대문자부터는 A : 65 ~ Z : 90
        String B = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) >= 'A' && B.charAt(i) <= 'Z') {
                result += ((int)(B.charAt(i) - 55) * (int)(Math.pow(N, B.length()-1 - i)));
            } else{
                result += ((int)(B.charAt(i) - '0') * (int)(Math.pow(N, B.length()-1 - i)));
            }
        }

        bw.write(Integer.toString(result));
        br.close();
        bw.flush();
        bw.close();
    }

}
