import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String n1 = st.nextToken();
        String n2 = st.nextToken();

        StringBuilder revn1 = new StringBuilder();
        StringBuilder revn2 = new StringBuilder();

        for (int i = n1.length() - 1; 0 <= i; i--) {
            revn1.append(n1.charAt(i));
        }
        for (int j = n2.length() - 1; 0 <= j; j--) {
            revn2.append(n2.charAt(j));
        }

        // reverse 된 문자열 대소 비교
        int result = Math.max(Integer.parseInt(revn1.toString()), Integer.parseInt(revn2.toString()));
        bw.write(Integer.toString(result));

        br.close();
        bw.flush();
        bw.close();
    }
}