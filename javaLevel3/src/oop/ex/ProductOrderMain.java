package oop.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];
        for (int i = 0; i < 3; i++) {
            products[i] = new ProductOrder();
        }
        products[0].productName = "두부";
        products[0].price = 2000;
        products[0].quantity = 2;

        products[1].productName = "김치";
        products[1].price = 5000;
        products[1].quantity = 1;

        products[2].productName = "콜라";
        products[2].price = 1500;
        products[2].quantity = 2;

        int sum = 0;
        for(ProductOrder p : products) {
            System.out.println("상품명: " + p.productName +
                    ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.price * p.quantity;
        }

        System.out.println("총 결제 금액: " + sum);
    }
}

/*
요구사항
1. ProductOrderMain 클래스 안에 main() 메서드를 포함하여, 여러상품의 주문 정보를 배열로 관리하고,
    그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
2. 입력값
두부, 2000, 2
김치, 5000, 1
콜라, 1500, 2

3. 출력예시
상품명: 두부, 가격 : 2000, 수량: 2
상품명: 김치, 가격 : 5000, 수량: 1
상품명: 콜라, 가격 : 1500, 수량: 2
총 결제 금액: 12000
*/