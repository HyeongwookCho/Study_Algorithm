import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        br.close();
        HashMap<Character, Integer> alphaList = new HashMap<Character, Integer>();

        for (int i = 0; i < 26; i++) {
            alphaList.put((char)(65+i), 0);
        }
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if(alphaList.containsKey(c)) {
                alphaList.put(c, alphaList.get(c) + 1);
            }
        }

        char maxChar = '?';
        int maxCount = 0;
        boolean isDuplicate = false;

        for (Character key : alphaList.keySet()) {
            int value = alphaList.get(key);
            if (value > maxCount) {
                maxCount = value;
                maxChar = key;
                isDuplicate = false;
            } else if (value == maxCount) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            bw.write('?');
        } else {
            bw.write(maxChar);
        }
        bw.flush();
        bw.close();
    }
}
