import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        // 많이 사용된 알파벳을 체크하기 위해 중복성 제거
        HashSet<Character> arr = new HashSet<Character>();
        // 각 경우마다 사용된 수를 기록하기 위한 배열
        int[] checkedNumList = new int[arr.size()];


        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
        }
        // set으로 선언되었기에 index 값을 알기 위해 Character[] 로 변환
        Character[] checklist = arr.toArray(new Character[0]);

        // 각 케이스와 str 이 일치하는 지 check and count
        int maxCount = 0;
        int maxIndex = 0;
        for (int j = 0; j < checklist.length; j++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if(checklist[j] == str.charAt(k)){
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxIndex = j;
            } else if (count == maxCount) {
                maxIndex = -1;  // 동일한 횟수로 가장 많이 등장하는 문자가 여러 개 있는 경우
            }
        }

        if (maxIndex == -1) {
            System.out.println("?");
        } else {
            System.out.println(checklist[maxIndex]);
        }
        
        bw.flush();
        bw.close();
    }

}
