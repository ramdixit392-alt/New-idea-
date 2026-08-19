import java.util.Scanner;

public class Main {

    static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int curr = tribonacci(n - 1)
                 + tribonacci(n - 2)
                 + tribonacci(n - 3);

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = tribonacci(n);

        System.out.println(result);

        sc.close();
    }
}