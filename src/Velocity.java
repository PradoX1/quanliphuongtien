public enum Velocity {
    BUS(20),
    TRAIN(40),
    AIRPLANE(80);

    private final double speedValue;

    Velocity(double speedValue) {
        this.speedValue = speedValue;
    }
    public double getSpeedValue() {
        return speedValue;
    }
}
