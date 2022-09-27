public class Main {
    public static void main(String[] args) {


        int []arr={55,5515,51,8,-88, 88,320,-30, 551 };
        System.out.println("минимальное значение в данном маccиве : "+ numMin(arr));

        printIntArray(arr);
        System.out.println("Min= " + numMin(arr));
        System.out.println("-------------------------");
        String[]str= {"qwe","qwertyuio", "qas", "lk", "h", ""};
        System.out.println(getIndexOfLongestString(str));
        System.out.println(  str[getIndexOfLongestString(str)]   );
    }
    public static void printIntArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%5d   ", i, arr[i]);
            if (i%5 == 0&&i!=0) {
                System.out.println();
            }

        }
        System.out.println();
    }
//Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
    public static int numMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { //если
                min = arr[i];
            }
        }
        return min;
    }
    // Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.      Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2

    public static int getIndexOfLongestString(String[] strings){
        int indexMax=0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()> strings[indexMax].length()){
                indexMax=i;
            }
        }
        return indexMax;
    }

    public static int getMin2(int[]arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { //если
                min = arr[i];
            }
        }
        return min;
    }
}