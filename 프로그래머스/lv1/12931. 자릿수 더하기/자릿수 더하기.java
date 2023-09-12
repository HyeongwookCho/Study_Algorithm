import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String temp = String.valueOf(n);
        char[] eachNum = temp.toCharArray();
        
        for(int i = 0; i < eachNum.length; i++){
            answer = answer + Character.getNumericValue(eachNum[i]);
        }

        return answer;
    }
}