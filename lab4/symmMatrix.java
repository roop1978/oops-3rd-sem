import java.util.Scanner;

class SymmMatrix {
    public static void main(String args[]) {
        int i, j, m, n, f = 0;
        int sum = 0;
        System.out.println("enter dimensions of array:");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        int trans[][] = new int[m][n];
        System.out.println("enter elements:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("original matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("transpose matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(trans[i][j]);
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i][j] != trans[i][j])
                    f++;
                break;
                // System.out.println("matrix is symmetric");

            }

        }
        if (f == 0) {
            System.out.println("matrix is  symmetric");
        } else {
            System.out.println("matrix is not symmetric");
        }
    }
}