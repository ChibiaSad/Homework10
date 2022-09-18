public class Car extends Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("меняем покрышку");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
