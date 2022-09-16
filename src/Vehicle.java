abstract class Vehicle implements Service {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        if (wheelsCount > 0) {
            this.wheelsCount = wheelsCount;
        } else throw new RuntimeException("колеса должны быть");
    }

    abstract void updateTyre();
    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
