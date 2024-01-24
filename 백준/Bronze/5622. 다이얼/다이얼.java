import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] trsword = getTranslateGrandmaWord(br.readLine());
        br.close();
        int MinSecond = CaculateDuration(trsword);
        bw.write(Integer.toString(MinSecond));
        
        bw.flush();
        bw.close();
    }

    // 할머니의 단어를 숫자로 변환하는 메서드
    /*
        [상근이의 할머니가 번호를 기억하는 방법]
        2: ABC
        3: DEF
        4: GHI
        5: JKL
        6: MNO
        7: PQRS
        8: TUV
        9: WXYZ

       EX) UNUCIC == 868242
           WA == 92
        */
    public static int[] getTranslateGrandmaWord(String word){
        String UpperWord = word.toUpperCase();
        int[] trsword = new int[UpperWord.length()];
        for (int i = 0; i < trsword.length; i++) {
            switch (UpperWord.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    trsword[i] = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    trsword[i] = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    trsword[i] = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    trsword[i] = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    trsword[i] = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    trsword[i] = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    trsword[i] = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    trsword[i] = 9;
                    break;
            }
        }
        return trsword;
    }


    // 변환된 알파벳에 해당하는 숫자까지 도달하는 시간 계산하는 메서드
    public static int CaculateDuration(int[] trsword) {
        int result = 0;

        for (int i = 0; i < trsword.length; i++) {
            result += trsword[i]+1;
        }

        return result;
    }
}