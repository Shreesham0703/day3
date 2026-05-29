public class palindrome {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int largest = 0;
        int second = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}