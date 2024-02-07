import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());

            if (firstNum != 0 && secondNum != 0) {
                if (firstNum % secondNum == 0) {
                    bw.write("multiple");
                    bw.newLine();
                } else if (secondNum % firstNum == 0) {
                    bw.write("factor");
                    bw.newLine();
                }else{
                    bw.write("neither");
                    bw.newLine();
                }
            }else{
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
