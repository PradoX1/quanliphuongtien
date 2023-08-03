public class Train extends Method{
    private double street;
    private double velocity;

    public Train(double street, double velocity) {
        this.street = street;
        this.velocity = velocity;
    }
    public double caculateTime() {
        double time;
        return time = street / velocity;
    }
    public void printInfo() {
        System.out.println("Thời gian bạn đến điểm dừng là: "+caculateTime()+"h");
    }
}
