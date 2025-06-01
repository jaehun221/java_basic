package oop.class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student[] students = new Student[2];

        students[0] = new Student();
        students[1] = new Student();

        students[0].name = "홍길동";
        students[0].age = 15;
        students[0].grade = 90;

        students[1].name = "장발장";
        students[1].age = 16;
        students[1].grade = 80;

        // for
        for (int i=0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name +
                    " 나이: " + students[i].age + "새 성적: " + students[i].grade);
        }

        // for each
        for (Student s : students) {
            System.out.println("이름: " + s.name +
                    " 나이: " + s.age + "새 성적: " + s.grade);
        }
    }
}
