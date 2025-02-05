import java.util.Scanner;

public class secondlargestnum {

    public static int findsecondlargest(int[] arr, int n){
        if(arr == null || arr.length < 2){
            return -1;
        }
        int lar = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        int sec = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] != lar && arr[i] > sec){
                sec = arr[i];
            }
        }
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Elements of Array; ");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findsecondlargest(arr,n));
        sc.close();
    }
}