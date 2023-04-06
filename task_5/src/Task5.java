import java.util.Scanner;

public class Task5 {
    public static void sumOfFigures(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n % 10;
        sumOfFigures(n / 10, sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        sumOfFigures(a, 0);
    }
}
