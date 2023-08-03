public class Bus extends Method {
    private double street;
    private double velocity;

    public Bus(double street, double velocity) {
        this.street = street;
        this.velocity = velocity;
    }
    public double caculateTime() {
        double time;
        return time = street / velocity;
    }
    @Override
    public void printInfo() {
        System.out.println("Thời gian bạn đến điểm dừng là: "+caculateTime()+"h");
    }
}
