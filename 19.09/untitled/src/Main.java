public class Main {
    public static void main(String[] args) {

        //Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
        //{3, 2, -1, 5, -3} ->10


        int[] arr= {3, 2, -1, 5, -3};

        System.out.println("Сумма положительных eлементов маccива : " + summArray(arr));

    }
    public static int summArray (int [] arr){
        int sum = 0;
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] > 0) {
                sum += arr[index];
            }
        }
        return sum;
    }
}
