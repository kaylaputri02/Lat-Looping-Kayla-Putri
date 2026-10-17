package TugasSesi4;
import java.util.Scanner;
public class EvenNumberSum {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = inputan.nextInt();

        int total = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }

        System.out.println("Output: Sum of even numbers = " + total);

        inputan.close();
    }
}