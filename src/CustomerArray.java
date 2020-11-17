import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)( Math.round(Math.random()*10) );
        }
        int arrayMax = array[0];
        int arrayMin = array[0];
        int arraySum = 0;

        for (int j : array) {
            if (arrayMax < j) {
                arrayMax = j;
            }
            if (arrayMin > j) {
                arrayMin = j;
            }
            arraySum += j;
        }
        System.out.println("Наибольшее значение массива: " + arrayMax);
        System.out.println("Наименьшее значение массива: " + arrayMin);
        System.out.println("Общая сумма всех элементов: " + arraySum);
        System.out.println("Среднее арифметическое всех элементов: " + (arraySum/array.length));
        System.out.println("Все нечетные значения: ");
        for (int i:array) {
            if(i%2==1){
                System.out.print(" " + i);
            }
        }
    }
}
