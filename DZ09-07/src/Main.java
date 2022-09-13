public class Main {
    public static void main(String[] args) {

/*Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку, которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно) до позиции endIndex (не включительно). Если startIndex  «не попадает в строку» или больше endIndex выводим “error”. Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.  Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
“Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
“Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
“Java is a very popular language”,  startIndex=5  endIndex=136  -> “is a very popular language”
*/
        String str = "Java is a very popular language";
        int startIndex = 5;
        int endIndex = 5;

        String newStr = "";

        if (startIndex > endIndex || startIndex < 0 || startIndex > str.length()) {
            newStr = "error";
        } else if (startIndex == endIndex) {
            newStr += str.charAt(startIndex);
        }
        for (; startIndex < endIndex && startIndex < str.length(); startIndex++) {
            newStr += str.charAt(startIndex);
        }
        System.out.println(newStr);
        System.out.println("----------------------");





            /*Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора).
             Использовать циклы.
             */

        int res;
        for (int i = 1; i < 10; i++) {


            for (int j = 1; j < 10; j++) {
            res=i*j;
                System.out.print(res + "\t\t");
            }
            System.out.println();

        }
    }
    }

