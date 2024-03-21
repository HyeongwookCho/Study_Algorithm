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
        int result = 0;

        // 최적화된 시작점 찾기
        // N의 자리수 * 9만큼 빼주는 것으로 안전한 출발점 결정하기 (216 일 때는 189부터 출발)
        // ==> 3자리 일 때 최대 9,9,9가 들어올 수 있는데 그럼 찾고자 하는 M(result)는 216 으로부터 최대 27 차이가 난다. 그래서 189부터 출발한다.
        // 1자리 일때는 무조건 0이니 노상관~
        // 성능 개선!
        
        int start = Math.max(N - 9 * String.valueOf(N).length(), 0);

        for (int M = start; M < N; M++) {
            int decomSum = GetDecompositionSum(M);
            if(decomSum == N){
                result = M;
                break;
            }
        }
        bw.write(Integer.toString(result));

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