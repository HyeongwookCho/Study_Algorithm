import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int lines = 20;
        HashMap<String, Double> gradeMap = new HashMap<String, Double>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        Double multiplyGradeSum = 0.0;
        Double myGradeSum = 0.0;
        Double result;

        for (int i = 0; i < lines; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 넘기기

            // 내 성적
            String myGradeStr = st.nextToken();
            Double myGrade = Double.parseDouble(myGradeStr);


            // 성적 기준
            String gradeStr = st.nextToken();
            if(!gradeStr.equals("P")){
                Double grade = Double.parseDouble(String.valueOf(gradeMap.get(gradeStr)));

                multiplyGradeSum += (myGrade * grade);
                myGradeSum += myGrade;
            } else continue;
        }

        result = multiplyGradeSum / myGradeSum;

        bw.write(String.format("%.6f",result));

        br.close();
        bw.flush();
        bw.close();
    }

}
