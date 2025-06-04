package poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount) {
        Pay[] pays = {new KakaoPay(), new NaverPay(), new ApplePay()};
        boolean result = false;
        System.out.println("결재를 시작합니다: option=" + option + ", amount=" + amount);
        for (Pay p : pays) {
            if (p.name(option)) {
                result = true;
                p.pay(amount);
                break;
            }
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
        }
    }
}