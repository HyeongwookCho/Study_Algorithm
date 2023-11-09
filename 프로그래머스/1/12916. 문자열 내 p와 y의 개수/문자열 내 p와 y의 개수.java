class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String newstr = new String(s);
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < newstr.length(); i++) {
            if (newstr.charAt(i) == 'P' || newstr.charAt(i) == 'p') {
                pCount++;
            }
            if (newstr.charAt(i) == 'Y' || newstr.charAt(i) == 'y') {
                yCount++;
            }
        }
        answer = (pCount == yCount) ? true : false;        
        return answer;
    }
}