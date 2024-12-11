import java.util.Scanner;

public class MaxColumnSum {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        findMaxSumColumn(arr, N);
    }

    public static void findMaxSumColumn(int arr[][], int N) {
        int[] columnSum = new int[N];
        int maxSum = Integer.MIN_VALUE;
        int columnIndex = -1;

        for(int col = 0; col < N; col++) {
            for(int row = 0; row < N; row++) {
                columnSum[col] += arr[row][col];
            }
        }

        for(int i = 0; i < N; i++) {
            if(columnSum[i] > maxSum) {
                maxSum = columnSum[i];
                columnIndex = i;
            }
        }

        System.out.println((columnIndex + 1) + " " + maxSum);
    }
}
