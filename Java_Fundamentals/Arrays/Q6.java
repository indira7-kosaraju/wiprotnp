import java.util.Arrays;
public class Q6 {
    public static void main(String[] args) {
        int[] arr={90,40,30,50,20};
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
