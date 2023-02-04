package org.example;

import org.example.busmake.Bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();
        System.out.println("탑승 승객 수 : "+bus.setCurrent_Passenger(3));
        System.out.println("최대 승객 수 : "+bus.max_Passenger());
        System.out.println("잔여 승객 수 : "+ bus.count_Passenger());
        System.out.println("요금 확인 : "+ bus.check_Pay());
        System.out.println("탑승 승객 수 : "+bus.getOn_Passenger(4));
//        System.out.println("잔여 승객 수 : "+ bus.count_Passenger());
        System.out.println("주유량 : "+ bus.getAmount_Oil());
        System.out.println("주유 시작");
        bus.setAmount_Oil(50);
        System.out.println("주유량 : "+ bus.getAmount_Oil());
//        bus.onoff_Vehicle();
        System.out.println("운행 가능 확인 : "+bus.check_status());
//        System.out.println("탑승 승객 수 : "+bus.getOn_Passenger(45));
//        System.out.println("운행 가능 확인 : "+bus.check_status());
//        System.out.println("----두번째 버스 start --");
//        System.out.println("탑승 승객 수 : "+bus2.getOn_Passenger(3));
//        System.out.println("요금 확인 : "+ bus2.check_pay());
//        System.out.println("주유합니다. : "+ bus2.oiling(5));
//        System.out.println("주행가능 확인 : "+ bus2.check_status());
//          bus2.onoff_Vehicle();
//        System.out.println("주유합니다. : "+ bus2.oiling(5));
//        System.out.println("남은 좌석 수 확인 : "+bus2.rest_Passsenger());
//        System.out.println(bus2.check_status());
    }
}