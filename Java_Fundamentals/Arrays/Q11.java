public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};
        boolean flag = true;
        for (int num : arr) {
            if (num != 1 && num != 4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}