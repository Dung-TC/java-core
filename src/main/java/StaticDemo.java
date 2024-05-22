public class StaticDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // static: thuộc về class
        Student s1 = new Student("khoa" , 20);
        Student s2 = new Student("Hung", 15);

        s1.count = 10;
        System.out.println("s2.count = " + s2.count);

        // truy cập thông qua tên của class
        System.out.println("Student.count = " + Student.count);

        int max = Student.max(10,100);
        System.out.println("max = " + max);

        // Static không thể truy cập non-static(cá nhân)
        // non-static có thể truy câp static



    }
}
