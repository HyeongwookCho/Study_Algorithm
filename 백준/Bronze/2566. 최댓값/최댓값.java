import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int DEFAULT_NUM = 9;
        int max = 0;
        int x = 0, y = 0;
        int[][] arr = new int[DEFAULT_NUM][DEFAULT_NUM];

        // input -> 2차원 배열 삽입
        for (int i = 0; i < DEFAULT_NUM; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < DEFAULT_NUM; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < DEFAULT_NUM; i++) {
            for (int j = 0; j < DEFAULT_NUM; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(x+1)+" "+Integer.toString(y+1));

        br.close();
        bw.flush();
        bw.close();
    }

}
