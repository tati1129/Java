public class Main {
    //C помощью цикла for написать метод, печатающий цифры от 1 до числа n
    public static void counterNum(int n) {
        int i = 1;
        for (i = 1; i <= n; i = i + 1) {
            System.out.println(i);
        }
    }

    //C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
    public static int counterSum(int num) {
        int k = 1;
        int sum = 0;

        for (k = 1, sum = 0; k <= num; sum+= k++) ;
        System.out.println("Counter sum  is: "+ sum);
        return sum;
    }

        public static void main (String[]args){

            counterNum(5);
            System.out.println("-----");
            counterSum(5);

        }
    }


