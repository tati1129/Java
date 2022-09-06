public class Main {
    public static void main(String[] args) {

        String str = "Java is a very popular language";
        System.out.println(str.length());
        int i1=0;

        while (i1<4) {
            System.out.print(str.charAt(i1));
            i1 += 1;
        }

        int i2=23;
        while (i2<31) {
            System.out.print(str.charAt(i2));
            i2 += 1;
        }
    }
}
