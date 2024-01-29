import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        // 입력값을 2차원 배열 형태로 만들기
        for (int i = 0; i < N*2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {

                if(i < N){
                    arr1[i][j] = Integer.parseInt(st.nextToken());
                }else{
                    arr2[i-N][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        //행렬합
        for (int ii = 0; ii < arr1.length; ii++) {
            for (int jj = 0; jj < arr1[0].length; jj++) {
                arr1[ii][jj] += arr2[ii][jj];
                bw.write(Integer.parseInt(String.valueOf(arr1[ii][jj]))+" ");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
