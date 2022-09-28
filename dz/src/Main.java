public class Main {
    public static void main(String[] args) {
String[]arr={"jack", "nick", "john","jack","tom","john","ann","john"};
int[]array={22,24,26,28};

        System.out.println(countOccirrence(arr, "john",1,8));
        System.out.println("-------------------------------------");
        System.out.println(createEvenIntArr(4,21));

    }
    //Реализовать метод, который возвращает сколько раз заданная имя встречается в массиве начиная с позиции start до позиции finish (включительно). Если строка не найдена, то возвращаем 0
    //Например:
    //countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,1,6) ->2
    //countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “sad”,0,6) ->0
    //countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,0,7) ->3
    private static int countOccirrence(String[]arr,String srt, int start,int finish){
        int realStart=Math.max(start,0);
        int realFinish=Math.min(finish,arr.length-1);

        int count=0;

        for (int i = realStart; i <=realFinish ; i++) {
            if (srt.equals(arr[i])){
                count++;
            }
        }
        return count;
    }
    //Реализовать метод, который создает массив из первых n четных чисел, начиная с заданного числа start.   Например, для заданных n=4, start=21: {22,24,26,28}

    private static int[] createEvenIntArr(int n, int start1) {
        int[] res = new int[n];

        start1 = (start1 % 2 == 0) ? start1 : start1 + 1;

        for (int i = 0; i < n; i++, start1 += 2) {
            res[i] = start1;
        }
        return res;
    }

}