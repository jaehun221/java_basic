package oop.class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String studentName1 = "홍길동";
        int stuAge1 = 15;
        int stuGrade1 = 90;

        String studentName2 = "장발장";
        int stuAge2 = 16;
        int stuGrade2 = 80;

        System.out.println("이름: " + studentName1 + " 나이" + stuAge1 +
                "새 성적: " + stuGrade1 + "점");
        System.out.println("이름: " + studentName2 + " 나이" + stuAge2 +
                "새 성적: " + stuGrade2 + "점");

        // 문제점
        // 학생이 늘어날 때 마다 변수와 출력하는 코드를 추가해야 함.
        // -> 해결하기 가장 쉬운 방법

    }
}


//두명의 학생 정보를 출력하는 프로그램을 작성해야 한다.
//        각 학생은 이름, 나이, 성적을 가지고  있다.
//요구사항!
//1. 첫 번째 학생의 이름은 홍길동, 나이는 15세, 성적은 90점
//2. 두 번째 학생의 이름은 장발장, 나이는 16세, 성적은 80점
//3. 각 학생의 정보는 다음과 같은 형식으로 출력한다.
//        -이름: [이름] 나이: [나이]세 성적: [성적]점
//4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 한다.