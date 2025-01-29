public class second {
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }
        return secondMax;
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 32, 22, 54, 39, 53, 19};
        int result = findSecondLargest(arr);
        System.out.println("Second largest: " + result);
    }
}
