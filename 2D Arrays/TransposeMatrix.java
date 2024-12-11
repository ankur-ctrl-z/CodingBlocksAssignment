import java.util.*;
public class TransposeMatrix {
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[][] = new int[N][N];
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    Transpose(arr);
    }
    public static void Transpose(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    }
}
