public class Main {
    public static void main(String[] args) {

        //First level: С использованием цикла while yаписать метод, печатающий куб числа от 0 до данного чисда n.
        //Пример: на входе n=3  на выходе 0,1,8,27

        int n = 3;
        int i = 0;
        int res3;
        while (i <= n) {
            res3 = i * i * i;
            i += 1;
            System.out.println(res3);
        }

        System.out.println("-------------------------------------------------------");
        //Second level: С использованием цикла while yаписать метод, печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
        //Пример: на входе n=3  на выходе 0,3,6,9

        int n1=3;
        int i1=0;
        int res4;
        while (i1<=n1) {
            res4=i1*n1;
            i1+=1;
            System.out.println(res4);
        }
    }
}