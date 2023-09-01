import java.util.Scanner;

class Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");

            }
            System.out.print("\n");
        }

    }

}
