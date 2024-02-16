import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] xPoint = new int[3];
        int[] yPoint = new int[3];

        int findX = 0;
        int findY = 0;

        // 입력값
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xPoint[i] = Integer.parseInt(st.nextToken());
            yPoint[i] = Integer.parseInt(st.nextToken());
        }

        // x 좌표 3개 숫자 중 1개만 짝이 없다면 그 놈이 찾던 놈인겨
        if(xPoint[0] == xPoint[1]){
            findX = xPoint[2];
        } else if (xPoint[0] == xPoint[2]) {
            findX = xPoint[1];
        } else{
            findX = xPoint[0];
        }
        // y 좌표도 똑같어
        if(yPoint[0] == yPoint[1]){
            findY = yPoint[2];
        } else if (yPoint[0] == yPoint[2]) {
            findY = yPoint[1];
        } else{
            findY = yPoint[0];
        }

        bw.write(Integer.toString(findX)+" "+Integer.toString(findY));


        br.close();
        bw.flush();
        bw.close();
    }
}
