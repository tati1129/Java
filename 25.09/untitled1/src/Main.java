public class Main {
    public static void main(String[] args) {


        int []arr={1,3,6,-1,4,-5,9};
        System.out.println("минимальное значение в данном маccиве : "+ numMin(arr));

    }
//Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
    public static int numMin(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];

            }
        }
        return min;
    }
}