public class ServiceStation {
    public void check(Bicycle bicycle) {
        update(bicycle);
    }

    public void check(Car car) {
        update(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        update(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
    
    private void update(Vehicle vehicle){
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

}
