public enum Velocity {
    BUS(20),
    TRAIN(40),
    AIRPLANE(80);

    private final int speedValue;
    Velocity(int speedValue) {
        this.speedValue = speedValue;
    }
    public int getSpeedValue() {
        return speedValue;
    }
}
