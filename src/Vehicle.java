abstract class Vehicle {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        if (wheelsCount > 0) {
            this.wheelsCount = wheelsCount;
        } else throw new RuntimeException("колеса должны быть");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    abstract void updateTyre();
}
