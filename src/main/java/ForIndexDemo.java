public class ForIndexDemo {
    public static void main(String[] args) {
        //in ra t 1 -> 10
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        //in ra số chẵn 1 -> 10
        for (int i = 1; i < 10; i++) {
            if (1 % 2 == 0) {
                System.out.println(i);
            }
        }
        // cach 2
        for (int i = 2; i <= 8; i += 2){
            System.out.println(i);
        }



    }
}
