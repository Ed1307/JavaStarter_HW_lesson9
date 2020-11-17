public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = myReverse(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int index = 3;
        int count = 10;
        int[] arr2 = new int[count];
        arr2 = subArray(arr, index, count);
        for (int i:arr2) {
            System.out.print(i + " ");
        }
    }
    static int[] myReverse(int[] array){
        int[] array2 = new int[array.length];
        int x = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            array2[x] = array[i];
            x++;
        }
        return array2;
    }
    static int[] subArray(int[] array, int index, int count){
        int[] array2 = new int[count];
        while (index+count>array.length){
            array2[count-1]=1;
            count--;
        }
        int x = 0;
        for(int i = index; i < index+count; i++){
            array2[x]=array[i];
            x++;
        }
        return array2;
    }
}
