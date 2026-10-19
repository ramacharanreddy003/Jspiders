
import java.util.Scanner;

class PerfectNosInRange {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a limit");
        int n = sn.nextInt();
        for (int j = 1; j <= n; j++) {
            int sum = 0;

            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum += i;
                }

            }
            if (sum == j) {
                System.out.println(j + " is a perfect number");
            }
        }
    }
}
