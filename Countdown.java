package TugasSesi4;
import java.util.Scanner;
public class Countdown {
    public static void main (String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = inputan.nextInt();

        System.out.println("Output: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Start!");

        inputan.close();
    }
}