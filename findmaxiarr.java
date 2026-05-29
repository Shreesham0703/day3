public class findmaxiarr {
    public static void main(String[] args) {

        int[] arr = {76, 83, 55, 36};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
