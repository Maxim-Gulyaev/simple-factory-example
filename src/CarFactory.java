public class CarFactory {
    public Vehicle createVehicle(VehicleType type) {

        Vehicle toReturn = null;

        switch (type) {
            case CAR ->
                    toReturn = new Car();
            case TRACK ->
                    toReturn = new Track();
            case BOLID ->
                    toReturn = new Bolid();
            default -> throw new IllegalArgumentException("Wrong type" + type);
        }

        return toReturn;
    }
}
