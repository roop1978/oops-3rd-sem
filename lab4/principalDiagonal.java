import java.util.Scanner;

class PrincipalDiagonal {
    public static void main(String args[]) {
        int i, j, m, n;
        int sum = 0;
        System.out.println("enter dimensions of array:");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter elements:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i != j)
                    continue;
                System.out.println(arr[i][j]);
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i != j)
                    continue;

                sum += arr[i][j];

            }
        }
        System.out.println("the sum of  diagonal elements is:" + sum);
    }

}
