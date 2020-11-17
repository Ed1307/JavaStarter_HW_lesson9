public class UserArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2;
        arr2 = plusOneSize(arr);
        for (int i:arr2) {
            System.out.print(i+" ");
        }
        System.out.println();
        int value = 5;
        arr2 = plusValue(arr, value);
        for (int j:arr2) {
            System.out.print(j+" ");
        }
    }
    static int[] plusOneSize(int[] arr){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    static int[] plusValue(int[] array, int value){
        int[] array2 = new int[array.length+1];
        for(int i = 0; i < array.length; i++){
            array2[i+1] = array[i];
        }
        array2[0] = value;
        return array2;
    }
}
