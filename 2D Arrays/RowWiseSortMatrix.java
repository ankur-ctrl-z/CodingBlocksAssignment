import java.util.Arrays;
import java.util.Scanner;

public class RowWiseSortMatrix {
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();

    int arr[][] = new int[r][c];
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    RowWiseSort2DArray(arr);

    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

    }
    public static void RowWiseSort2DArray(int arr[][]) {
    for(int i = 0; i < arr.length; i++) {
        Arrays.sort(arr[i]);
    }
    }
}
