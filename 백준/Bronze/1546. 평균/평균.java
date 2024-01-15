import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] scores = new double[N];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            if (!(scores[i] <= 100) && !(scores[i] > 0)) {
                scores[i] = 0;
                System.out.println("Wrong data");
            }
        }

        fabricateScore(scores);
        System.out.println(getAverage(scores));

    }

    public static double getAverage(double[] scores) {
        double avg = Arrays.stream(scores).sum()/scores.length;
        return avg;
    }

    public static double[] fabricateScore(double[] scores){
        double max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        for (int j = 0; j < scores.length; j++) {
            scores[j] = (scores[j] / max * 100);
        }
        return scores;
    }
}