import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //[문제]
        // 2차원이 주어졌을 때, x,y 는 최대 100까지 존재함
        // 검은 색 종이를 입력 값에 해당하는 좌표에 부착할 때 ex) 5 7 이라면 (5,7)로부터 +10 씩 사각형을 그린다.
        // 겹쳐진 종이 3개의 총 넓이를 구하라


        //[풀이 방안]
        // 100,100 까지의 2차원 좌표계가 주어졌을 때,
        // 차지하는 만큼을 1로 채우고
        // 1로 차지한 부분만을 sum 하여 넓이를 구한다.

        int[][] coordinateSystem = new int[100][100];
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> input = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input.add(Integer.parseInt(st.nextToken()));
            input.add(Integer.parseInt(st.nextToken()));
        }

        // 입력된 좌표값부터 색종이 넓이 만큼 1 삽입
        for (int j = 0; j < N; j++) {
            int x = input.poll();
            int y = input.poll();

            for (int k = 0; k < 10; k++) {
                for(int h = 0; h < 10; h++){
                    coordinateSystem[x + k][y + h] = 1;
                }
            }
        }
        // 출력해보기
        int area = 0;
        for (int j = 0; j < coordinateSystem.length; j++) {
            for (int k = 0; k < coordinateSystem[0].length; k++) {
                area += coordinateSystem[j][k];
            }
        }

        bw.write(Integer.toString(area));

        br.close();
        bw.flush();
        bw.close();
    }

}
