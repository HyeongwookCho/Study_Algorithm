import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());

        // Math.pow 는 Double 형으로 반환한다.
        // 너무 큰 long 숫자는 double 형으로 표현시 오차범위가 존재합니다.
        // 따라서 정확하게 계산되지 못한다.
        // 부동소수점 방식에 대해서 알아봅시다.
        
        bw.write(Long.toString(a*a*a)+"\n");
        bw.write(Integer.toString(3));
        br.close();
        bw.flush();
        bw.close();
    }

}