import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList);

        
        System.out.println("Unique sorted array: " + uniqueList);

        scanner.close();
    }
}
