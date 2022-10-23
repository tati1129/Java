public class Main {
    public static void main(String[] args) {

        System.out.println(counterLetters("hello"));
        System.out.println(str("abcd"));
    }
// Написать метод, возвращающий целое число равное двойной длине строки, принимаемой в качестве аргумента метода.  Пример: hello -> 10
    private static int counterLetters(String str) {
        return str.length() * 2;

    }

    //Написать 2 метода:  один метод переставляет первую букву в конец строки (abcd-> bcda). Второй  метод переставляет последнюю букву в начало строки (abcd->dabc)
    public static String str(String str){
        return str.substring(str.length()-1)+str.substring(0,str.length()-1);
    }
}
