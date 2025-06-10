package lang.object.poly;

public class ObjectPolyExam2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();   // Object 인스턴스도 만들 수 있다. (추상 클래스가 아님)

        // 세상 모든 객체를 담을 수 있는 배열을 생성할 수 있다.
        Object[] objects = {dog, car, object};
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수: " + objects.length);
    }
}
