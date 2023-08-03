public class Train extends caculatedTime {
    private double street;
    private int velocity;

    public Train(double street, int velocity) {
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
