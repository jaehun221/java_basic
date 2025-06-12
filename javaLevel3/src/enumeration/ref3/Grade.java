package enumeration.ref3;

public enum Grade {
    BASIC(10), SILVER(15), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // Enum은 기본적으로 생성자가 private
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
