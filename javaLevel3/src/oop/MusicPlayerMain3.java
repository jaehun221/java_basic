package oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("현재 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("현재 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
    /*
    각각의 기능을 메서드로 만든 덕분에 각각의 기능이 **모듈화** 되었다.
    1. 중복 제거: 로직 중복이 제거되었다. 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
    2. 변경 영향 범위: 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
    3. 메서드 이름 추가: 메서드 이름을 통해 코드를 더 직관적으로 이해할 수 있다.

    절차 징향 프로그래밍의 한계
    데이터와 기능이 분리되어 있다.
    1. 음악 플레이어 데이터는 MusicPlayerData에 있는데, 그 데이터를 사용하는 기능은 MusicPlayerMain3에 있는 각각의 메서드이다.
    2. 음악 플레이어와 관련된 데이터는 MusicPlayerData를 사용해야 되고, 음악 플레이어와 관련된 기능은 MusicPlayerMain3를 사용해야 한다.
    -> 데이터와 기능이 분리되어 있으면 유지보수 관점에서도 관리 포인터가 2곳으로 늘어난다.
    -> 관련 데이터가 변경되면 MusicPlayerMain3 부분의 메서드들도 함께 변경해야 한다.
    */


}