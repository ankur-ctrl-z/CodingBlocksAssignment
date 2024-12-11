import java.util.Scanner;

public class WavePrint {
    public static void main(String args[]) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    int arr[][] = new int[M][N];
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    SpiralPrint(arr);
    }
    public static void SpiralPrint(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
        if(i % 2 == 0){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
        } else {
            for(int k = arr[0].length-1; k >= 0; k--){
                System.out.print(arr[i][k] + ", ");
            }
        }
    }
    System.out.print("END");
    }
}
