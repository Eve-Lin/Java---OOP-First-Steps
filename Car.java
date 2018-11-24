public class Car {

    String carName;
    int carId;

    Car(String name, int num){

        this.carName = name;
        this.carId = num;
    }
}

class Driver extends Car{

    String driverName;
    Driver(String name, String cname, int cid){
        super(cname,cid);
        this.driverName = name;
    }

    public static void main(String[] args) {

        Driver obj = new Driver("Eve","Mini Cooper", 7777);

        System.out.printf("%s drives a %s, which has the following car ID: %d", obj.driverName,obj.carName, obj.carId);
    }
}