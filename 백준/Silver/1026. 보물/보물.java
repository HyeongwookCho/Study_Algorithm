import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // S는 각 배열 A, B의 동일한 인덱스끼리의 곱의 합이다. S = A[0] × B[0] + ... + A[N-1] × B[N-1]
        // 이때 A의 수만을 재배열하여 S를 가장 작도록 만들어라
        // ex) A : {1, 1, 1, 6, 0}, B :{2, 7, 8, 3, 1} 일 때 A : {1, 1, 0, 1, 6} 으로 재배열한다.
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");

        int[] A = new int[N];
        int[] B = new int[N];
        int[] copyB = B.clone();
        int[] rearrangedA = new int[N];
        int[] index = new int[N];

        // 배열 세팅
        for (int i = 0; i < N; i++) {
            A[i] = (Integer.parseInt(strA[i]));
            B[i] = (Integer.parseInt(strB[i]));
            copyB[i] = (Integer.parseInt(strB[i]));
        }

        // B의 최대값에 해당하는 index를 순서대로 구하는 과정
        // 2, 7, 8, 3, 1 일 때 index[]에는 {2, 1, 3, 0, 4}
        int max = 0;
        int maxIndex = 0;
        int indexCounter = 0;
        for (int loopB = 0; loopB < N; loopB++) {
            // 최대값 찾기
            for (int i = 0; i < copyB.length; i++) {
                if (max < copyB[i]) {
                    max = copyB[i];
                    maxIndex = i;
                }
            }
            // 최대값에 해당하는 index 찾기
            for (int i = 0; i < copyB.length; i++) {
                if(copyB[i] == max){
                    index[indexCounter] = i;
                    indexCounter++;
                    break;
                }
            }
            // 초기화
            copyB[maxIndex] = -1 ;
            max = 0;
        }

        // index에 A의 최소값을 구하여 미리 정의된 index에 해당 값을 삽입한다.
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        indexCounter = 0;
        for (int loopA = 0; loopA < N; loopA++) {
            // 최소값 구하기
            for (int j = 0; j < A.length; j++) {
                if(A[j] != -1){
                    if(A[j] < min){
                        min = A[j];
                        minIndex = j;
                    }
                }
            }
            rearrangedA[index[indexCounter]] = min;
            indexCounter++;

            min = Integer.MAX_VALUE;
            A[minIndex] = -1;
        }

        // 재배열된 A와 B의 같은 인덱스끼리의 곱을 하고 모든 곱의 합을 구한다.
        int sum = 0;
        for (int lastLoop = 0; lastLoop < N; lastLoop++) {
            sum += (rearrangedA[lastLoop] * B[lastLoop]);
        }
        bw.write(Integer.toString(sum));
        br.close();
        bw.flush();
        bw.close();
    }

}