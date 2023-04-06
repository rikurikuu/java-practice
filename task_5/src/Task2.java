import java.util.Scanner;

public class Task2 {

    private static void showSequence(int n) {
        if(n < 1) {
            return;
        }
        showSequence(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        showSequence(a);
    }

}
