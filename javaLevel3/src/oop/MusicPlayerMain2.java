package oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        data. volume++;
        System.out.println("현재 볼륨 : " + data.volume);

        data.volume++;
        System.out.println("현재 볼륨 : " + data.volume);

        data.volume--;
        System.out.println("현재 볼륨 : " + data.volume);

        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

        /*
        음악 플레이어와 관련된 데이터는 MusicPlayerData 클래스에 존재한다.
        MusicPlayerData 클래스를 사용하도록 기존 로직을 변경한다.
        프로그램 로직이 더 복잡해져서 다양한 변수들이 추가되더라도 음악 플레이어와 관련된 변수들은
        MusicPlayerData data 객체에 속해있으므로 쉽게 구분할 수 있다.
        */
    }

}