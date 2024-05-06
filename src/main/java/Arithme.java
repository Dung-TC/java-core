public class Arithme {
    public static void main(String[] args) {
        int a = 100 ;
        int b= 10;

        a += 10;
        // giống với
        // += / -+ / *= /
        a = a + 10;

        // int d = b; gán xong rồi mới cộng
        // b = b + 1;
        int d = b++;
        System.out.println("d = " + d);

        // b = b + 1; cộng xong rồi gán
        // int e = b;
        int e = ++b;
        System.out.println("e = " + e);


    }
}
