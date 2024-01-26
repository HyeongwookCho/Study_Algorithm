import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int result = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> checkPalindrome = new Stack<Character>();
        br.close();


        for (int i = 0; i < str.length(); i++) {
            checkPalindrome.push(str.charAt(i));
        }

        for (int j = 0; j < str.length(); j++) {
            if(!checkPalindrome.empty()){
                sb.append(checkPalindrome.pop());
            }
        }
        if (str.equals(sb.toString())) {
            result = 1;
        } else {
            result = 0;
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }

}
