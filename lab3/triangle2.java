import java.util.Scanner;

class Triangle2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n:");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int k = 1; k <= n; k++)
            arr[k - 1] = k;
        for (int i : arr) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }

            System.out.print("\n");

        }

    }
}
