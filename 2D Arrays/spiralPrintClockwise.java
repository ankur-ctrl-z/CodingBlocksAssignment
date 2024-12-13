import java.util.Scanner;

public class spiralPrintClockwise {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int arr[][] = new int[M][N];

        for(int i = 0; i <arr.length; i++){
           for(int j = 0; j < arr[0].length; j++) {
               arr[i][j] = sc.nextInt();
           }
        }
        
        printSpiralClockwise(arr,M,N);

    }
public static void printSpiralClockwise(int[][] arr, int M, int N) {
        int minr = 0, minc = 0, maxr = M - 1, maxc = N - 1;
        int totalElements = M * N;
        int count = 0;

        while (count < totalElements) {
            for (int i = minc; i <= maxc && count < totalElements; i++) {
                System.out.print(arr[minr][i] + ", ");
                count++;
            }
            minr++;

            for (int i = minr; i <= maxr && count < totalElements; i++) {
                System.out.print(arr[i][maxc] + ", ");
                count++;
            }
            maxc--;

            for (int i = maxc; i >= minc && count < totalElements; i--) {
                System.out.print(arr[maxr][i] + ", ");
                count++;
            }
            maxr--;

            for (int i = maxr; i >= minr && count < totalElements; i--) {
                System.out.print(arr[i][minc] + ", ");
                count++;
            }
            minc++;
        }

        System.out.println("END");
    }
}
