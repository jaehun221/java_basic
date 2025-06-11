package poly.sort1;

public class BubbleSort implements Sort {
    private String name = "BubbleSort";

    @Override
    public void ascending(int[] nums) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println(name + " descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println(name + "입니다.");
    }
}
