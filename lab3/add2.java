import java.util.Scanner;

class Add2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n:");
        n = sc.nextInt();
        int k = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {

                System.out.print(k + "\t");
                k++;
            }

        }

    }
}
