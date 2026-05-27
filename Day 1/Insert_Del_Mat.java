import java.util.Scanner;

class Insert_Del_Mat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        int type = sc.nextInt();
        int index = sc.nextInt();

        if (type == 0) {

            int[][] b = new int[r + 1][c];

            for (int i = 0, k = 0; i < r + 1; i++) {

                if (i == index) {
                    for (int j = 0; j < c; j++)
                        b[i][j] = sc.nextInt();
                } else {
                    for (int j = 0; j < c; j++)
                        b[i][j] = a[k][j];
                    k++;
                }
            }

            for (int i = 0; i < r + 1; i++) {
                for (int j = 0; j < c; j++)
                    System.out.print(b[i][j] + " ");
                System.out.println();
            }

        } else {

            int[][] b = new int[r][c + 1];

            int[] col = new int[r];

            for (int i = 0; i < r; i++)
                col[i] = sc.nextInt();

            for (int i = 0; i < r; i++) {

                for (int j = 0, k = 0; j < c + 1; j++) {

                    if (j == index)
                        b[i][j] = col[i];
                    else
                        b[i][j] = a[i][k++];
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c + 1; j++)
                    System.out.print(b[i][j] + " ");
                System.out.println();
            }
        }
    }
}