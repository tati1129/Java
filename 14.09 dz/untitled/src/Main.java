public class Main {
    public static void main(String[] args) {
        //Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод, который вместо заданной строки с номером счета (например ”D”DE512827908726E5128279087265”) возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству засекреченных цифр).
        // Реализуйте 2 варианта метода:
        // 1) с использованием только циклов, length() и charAt()
        // 2) используя любые необходимые методы класса String
        String str = "DE5128279087265";
        System.out.println(mask1(str));
        System.out.println(mask2(str));
        System.out.println("--------------------");

       


    }

    private static String mask1(String str) {
        String res = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (i < 4 || i >= len - 2) {
                res += str.charAt(i);
            } else {
                res += '*';
            }
        }
        return res;
    }

    private static String mask2(String str) {
        int len = str.length();
        if (len <= 6) {
            return str;
        }
        String res = str.substring(0, 4);
        res += "*".repeat(len - 6);
        res += str.substring(len - 2);

        return res;
    }

}