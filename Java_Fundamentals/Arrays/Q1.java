public class Q1 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double average=(double)sum/arr.length;
        System.out.println("Sum of array elements: "+sum);
        System.out.println("Average of array elements: "+average);
    }
}
