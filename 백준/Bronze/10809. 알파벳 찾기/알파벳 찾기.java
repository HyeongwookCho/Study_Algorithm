import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[26];

        // 기본값은 -1
        Arrays.fill(arr, -1);

        for (int k = 0; k < s.length(); k++) {
            int index = s.charAt(k) - 'a';
            // 해당 알파벳이 처음 등장하는 위치만 저장
            if (arr[index] == -1) {
                arr[index] = k;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        br.close();
    }
}