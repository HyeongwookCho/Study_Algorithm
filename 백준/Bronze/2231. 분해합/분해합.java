import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 우리는 N 을 만들어낸 생성자 M 을 찾아야한다.
        // N 은 M 과 M의 분해합으로 이루어진 수이다. 그 예시로 256은 245+2+4+5 의 규칙으로 만들어진 수이다.
        // 어떻게 M 을 찾을 수 있을까? 216 = M + M[0] + M[1] + M[2] 인데 그걸 찾을만한 근거가 부족하다.
        // 우리는 재빠른 연산이 가능한 컴퓨터를 사용하고 있고, 처음부터 순회하며 찾을 수 있는 능력이 있다!



        // 생성자가 없는 경우 : 1 ~ 9
        // 생성자가 여러 개 인 경우 : 91 과 100



        int N = Integer.parseInt(br.readLine());
        int M = 0;

        for (int i = 0; i < N; i++) {
            if (GetDecompositionSum(i) == N) {
                M = i;
                break;
            }
        }
        bw.write(Integer.toString(M));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int GetDecompositionSum(int m){
        int result = m;

        String mStr = Integer.toString(m);

        for (int i = 0; i < mStr.length(); i++) {
            result += Integer.parseInt(mStr.substring(i,i+1));
        }
        return result;
    }
}