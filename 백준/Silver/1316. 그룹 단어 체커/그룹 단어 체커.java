import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        // 나왔던 문자가 이어서 나오면 그룹단어, 떨어져서 나오면 X

        int count = N;
        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String Token = st.nextToken();

            boolean[] arr = new boolean[26]; // 이미 나타난 문자인지 체크용 알파벳 배열

            // i == i+1 이면 && 이미 나타난 문자가 아니면 ==> 그룹단어

            // 문자를 아스키 코드를 사용하여 배열의 인덱스로 변환하는 과정
            // a ~ z 는 97 ~ 122 임. 0부터 25까지로 변환하기 위함임.
            arr[(int)Token.charAt(0) - 97] = true; // 처음 단어 확인
            for (int j = 1; j < Token.length(); j++) {
                char c = Token.charAt(j);
                // 이전 문자와 같으면 지속
                if(c == Token.charAt(j - 1)) continue;

                // 이전 문자와 다르고 이미 나타난 문자면 그룹 단어가 아니므로 count -1
                if (arr[(int) c - 97]) {
                    count--;
                    break;
                }
                arr[(int)c - 97] = true; // 지금 단어는 나타난 단어라고 기록
            }
        }
        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
