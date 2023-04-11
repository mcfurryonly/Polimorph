public class Main {
    public static void main(String[] args) {
        Transport car1 = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);


        Transport truck1 = new Truck("truck1", 8);
        Transport truck2 = new Truck("truck2", 6);


        Transport bicycle1 = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(truck1);
        station.check(truck2);
        station.check(bicycle1);
        station.check(bicycle2);
    }

}

