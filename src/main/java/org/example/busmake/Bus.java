package org.example.busmake;

public class Bus extends Vehicle{

    @Override
    public int max_Passenger() {
        return 30;
    }

    //20220204 리펙토링 진행중
//    int getMaxPass(){
//
//        return max_Passenger;
//    }
    public int pay(){
        return 1500;
    }
    public int current_Passenger() {
        return 0;
    }

    public int check_Pay(){
        return current_Passenger()*pay();
    }


    public int getOn_Passenger(int num) {
        int total = current_Passenger()+num;
        if (isStatus_Vehicle() == true) {
            if (total >= max_Passenger()) {
                System.out.println("최대 탑승 수 초과입니다.");
                int cantGeton = total-max_Passenger();
                System.out.println("최대 탑승 수 초과입니다. 못탄 인원 : "+cantGeton);
                return max_Passenger();
            }
            else return total;

        }
        if(isStatus_Vehicle()== false){
            return current_Passenger();
        }
        return total;
    }

    public int count_Passenger(){
        return max_Passenger()-getCurrent_Passenger();
    }
//
//    public int check_pay(){
//        return pay*current_Passenger;
//    }
//
//

//
//    public int rest_Passsenger(){
//        return max_Passenger-current_Passenger;
//    }

}
