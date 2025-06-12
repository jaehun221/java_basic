package enumeration.ex3;
// 모든 열거형은 java.lang.Enum 클래스를 자동으로 상속받는다.

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> Enum 변환, 잘못된 문자면 IllegalArgumentException 발생!!
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
