import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xMin = w - x;
        int yMin = h - y;
        int result = 0;

        if(x > xMin){
            result = xMin;
        } else {
            result = x;
        }

        if(y > yMin){
            result = yMin < result ? yMin : result;
        } else {
            result = y < result ? y : result;
        }

        bw.write(Integer.toString(result));

        br.close();
        bw.flush();
        bw.close();
    }
}
