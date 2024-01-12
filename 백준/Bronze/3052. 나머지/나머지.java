import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int REP = 10;

        // Hashset을 이용하여 서로 다른 값 확인하기
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < REP; i++) {
            uniqueNumbers.add(sc.nextInt() % 42);
        }
        System.out.println(uniqueNumbers.size());
    }
}