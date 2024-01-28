import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        /*str 에서 제일 많이 사용된 알파벳을 출력
        만약 많이 사용된 알파벳의 경우의 수가 2 이상인 경우 ? 를 출력

        1. 많이 사용된 알파벳을 어떻게 알 수 있을까
        1) 먼저 str 에 들어온 문자들의 dictionary 를 만든다. ex) hello 인 경우에
        {
            h : 0,
            e : 0,
            l : 0,
            o : 0
        }
        [수정]
        하지만 str 에 들어온 알파벳만 List를 만드는 방법은 HashSet을 이용해야하기때문에
        변환 과정 및 삽입이 불필요한 반복을 초래함
        알파벳의 count는 26으로 정해져 있으므로 (A to Z)
        모든 경우의 알파벳을 키값으로 가지는 dictionary를 만들어보자

        2) for(str에서 dictionary.key 에 해당하는 char 값이 있을 경우 value += 1;)
        3) 작업이 완료되었으면, 마지막으로 dictionary를 순회하며 제일 키 값 높은 것들을 선정
        if(max.count >= 2) ? sout(2) : sout(dictionary.key)

        이렇게 하면 빅오2N으로 작업 가능*/
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
