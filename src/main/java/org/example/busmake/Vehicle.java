package org.example.busmake;
//        1. 최대 승객수
//        2. 현재 승객수
//        3. 요금
//        4. 버스 번호
//        5. 주유량
//        6. 현재 속도
//        7. 상태
//        1.  운행, 차고지 행
abstract class Vehicle {

    abstract int max_Passenger();


    //20220204 리펙토링 진행중
    //int max_Passenger;

    abstract int check_Pay();

    abstract int pay();
    private int current_Passenger = 0;


    private int bus_Num;



    private int amount_Oil=0;
    private int current_Speed;

    private boolean status_Vehicle = true;

//  기능
//1. 운행
//2. 버스 상태 변경
//3. 승객 탑승
//4. 속도 변경



    void speedUp() {
        System.out.println("current speed : "+current_Speed);
        ++current_Speed;}

    void speedDown() {
        System.out.println("current speed : "+current_Speed);
        --current_Speed;}

    public String check_status(){
        String answer = "운행중";

        if(getAmount_Oil()<10){
            System.out.println("----기름이 부족하여 운행이 불가합니다. 잔량을 확인하세요. 잔량 : "+getAmount_Oil());
            status_Vehicle = false;
            return "차고지행";
        }
        if(status_Vehicle==true){
            return answer;
        }
        else return "차고지행";
    }

    public void onoff_Vehicle(){
        status_Vehicle = !status_Vehicle;
    }

    public int getAmount_Oil() {
        return amount_Oil;
    }

    public void setAmount_Oil(int amount_Oil) {
        this.amount_Oil = amount_Oil;
    }


    public int getCurrent_Passenger() {
        return current_Passenger;
    }

    public int setCurrent_Passenger(int current_Passenger) {
        return this.current_Passenger = current_Passenger;
    }

    public boolean isStatus_Vehicle() {
        return status_Vehicle;
    }

    public void setStatus_Vehicle(boolean status_Vehicle) {
        this.status_Vehicle = status_Vehicle;
    }

}
