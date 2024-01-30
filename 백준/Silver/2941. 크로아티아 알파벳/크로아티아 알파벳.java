import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        br.close();
        int count = 0;
        String[] arr = {
                "c=",
                "c-",
                "dz=",
                "d-",
                "lj",
                "nj",
                "s=",
                "z="
        };

        for(int i = 0; i < arr.length; i++){

            // 단순히 포함하는 지 여부를 파악하면 안된다. 나머지 char의 갯수를 알 수 없음.
            // 치환하여 갯수를 세는 방법을 사용한다.
            if (str.contains(arr[i])) {
                str = str.replace(arr[i], "*");
            }

        }
        bw.write(Integer.toString(str.length()));

        bw.flush();
        bw.close();
    }
}
