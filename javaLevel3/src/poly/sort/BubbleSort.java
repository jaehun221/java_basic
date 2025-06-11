package poly.sort;

public class BubbleSort implements Sort {
    @Override
    public int[] ascending(int[] arr) {
        System.out.println("BubbleSort ascending");
        return new int[0];
    }

    @Override
    public int[] descending(int[] arr) {
        System.out.println("BubbleSort descending");
        return new int[0];
    }

    @Override
    public void description(int[] arr) {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println("BubbleSort입니다.");
    }
}
