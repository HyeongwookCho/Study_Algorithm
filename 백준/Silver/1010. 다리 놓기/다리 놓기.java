import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        int[] west = new int[testCount];
        int[] east = new int[testCount];        
        
        for(int i = 0; i < testCount; i++)
        {
            west[i] = sc.nextInt();
            east[i] = sc.nextInt();
        }
        sc.close();
        
        for(int j = 0; j < testCount; j++)
        {
            System.out.println(Combination(east[j],west[j]));            
        }
    }
    public static BigInteger Combination(int n, int r){
        return factorial(n).divide(factorial(n-r).multiply(factorial(r)));
    }
    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(; n > 1; n--)
        {
            result = result.multiply(BigInteger.valueOf(n));
        }
        return result;
    }
}