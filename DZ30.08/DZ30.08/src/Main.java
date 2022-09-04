public class Main {
    public static void main(String[] args) {
        /*аписать программу, которая печатает все целые числа в диапазоне  между num1 и num2 включительно. Учтите, num1 может быть как меньше, так больше или равно  num2.*/

        int num1 = 15;
        int num2 = 2;

       if (num1 >= num2) {
            while (num2 <= num1) {
                System.out.printf("num2 ( %d )%n", num2);
                num2++;
            }
        }

        if (num2 > num1) {
            while (num1 < num2) {
                System.out.printf("num1 ( %d )%n", num1);
                num1++;
            }
        }
    }
    }


