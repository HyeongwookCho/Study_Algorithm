import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*가변은 아니고 입력이 들어오면 제일 큰 size 의 arr[i]의 배열로 N x N 2차원 배열을 생성해야함

        2차원 배열 생성하고 그냥 stringTokenizer로 넣어도 됨
        빈 곳은 공백으로 채워둠

        총 5줄 인게 정해졌으니*/

        String[] str = new String[5];
        int arrMaxSizeCheck = 0;

        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
            if (str[i].length() > arrMaxSizeCheck) {
                arrMaxSizeCheck = str[i].length();
            }
        }

        char[][] arr = new char[5][arrMaxSizeCheck];

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < arrMaxSizeCheck; k++) {
                // 문자열의 길이가 k보다 크면 해당 문자를 배열에 넣고,
                // 그렇지 않으면 공백
                if (str[j].length() > k) {
                    arr[j][k] = str[j].charAt(k);
                } else {
                    arr[j][k] = ' ';
                }

            }
        }

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < arrMaxSizeCheck; j++) {
            for (int k = 0; k < 5; k++) {
                if (arr[k][j] != ' ') { // 공백이 아닌 문자만 추가
                    result.append(arr[k][j]);
                }
            }
        }

        bw.write(result.toString());
        br.close();
        bw.flush();
        bw.close();
    }

}
