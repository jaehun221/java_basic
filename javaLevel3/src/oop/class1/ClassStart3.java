package oop.class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "홍길동";
        stu1.age = 15;
        stu1.grade = 90;

        Student stu2 = new Student();
        stu2.name = "장발장";
        stu2.age = 16;
        stu2.grade = 80;

        System.out.println("이름: " + stu1.name + " 나이" + stu1.age
                + "새 성적: " + stu1.grade + "점");

        System.out.println("이름: " + stu2.name + " 나이" + stu2.age
                + "새 성적: " + stu2.grade + "점");

        System.out.println(stu1);
        System.out.println(stu2);
    }
}
