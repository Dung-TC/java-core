package backend;

import entity.Student;

public class Exercise01 {
    public static void question01(){
        Student s1 = new Student("nguyen van A");
        Student s2 = new Student("nguyen van B");
        Student s3 = new Student("nguyen van C");
        Student[] students = {s1,s2,s3};

        Student.college = "Đại học bách khoa";
        System.out.println("s1.college =  " + s1.college);
        System.out.println("s2.college =  " + s2.college);
        System.out.println("s3.college =  " + s3.college);

        Student.college = "Đại học Công nghệ";
        System.out.println("s1.college =  " + s1.college);
        System.out.println("s2.college =  " + s2.college);
        System.out.println("s3.college =  " + s3.college);

    }
    public static void question02(){
        Student s1 = new Student("nguyen van A");
        Student s2 = new Student("nguyen van B");
        Student s3 = new Student("nguyen van C");

        s1.moneyGroup +=100;
        s2.moneyGroup +=100;
        s3.moneyGroup +=100;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s1.moneyGroup -= 50;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s2.moneyGroup -= 20;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s3.moneyGroup -= 150;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s1.moneyGroup += 50;
        s2.moneyGroup += 50;
        s3.moneyGroup += 50;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

    }

    public static void question05(){
        Student s1 = new Student("nguyen van A");
        Student s2 = new Student("nguyen van B");
        Student s3 = new Student("nguyen van C");
        System.out.println(" Số lượng học sinh: " + Student.count);
    }


}
