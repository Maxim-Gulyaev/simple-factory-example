public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Vehicle car = carFactory.createVehicle(VehicleType.CAR);
        Vehicle track = carFactory.createVehicle(VehicleType.TRACK);
        Vehicle bolid = carFactory.createVehicle(VehicleType.BOLID);

        car.go();
        track.go();
        bolid.go();
    }
}