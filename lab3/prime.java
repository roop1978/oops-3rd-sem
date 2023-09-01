import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int m, n, i, j, f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        m = sc.nextInt();
        System.out.println("Enter upper limit:");
        n = sc.nextInt();
        for (i = m; i <= n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = 0;
                }
            }
            if (f != 0) {
                System.out.println("primes between" + "" + m + "" + "&" + n + "" + "are:" + i);

            }

        }

    }

}
