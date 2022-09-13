public class Main {
    public static void main(String[] args) {


        //Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»

        System.out.println(replace("саша",'с','д'));
        System.out.println(replace("харавод",'а','о'));

    }
    public static String replace(String str, char oldChar, char newChar) {

        String res = "";

        for (int i = 0; i < str.length(); i+=1) {
            if (str.charAt(i) == oldChar) {
                res = res + newChar;
            } else {
                res = res + str.charAt(i);
            }
        }
        return res;
    }

}