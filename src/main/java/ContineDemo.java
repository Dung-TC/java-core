public class ContineDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // bỏ qua không in ở vị trí này, in ông tiếp theo
            }
            System.out.println(i);
        }
    }
}
