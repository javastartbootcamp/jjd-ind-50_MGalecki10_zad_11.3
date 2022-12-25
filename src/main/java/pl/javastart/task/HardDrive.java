package pl.javastart.task;

public class HardDrive extends Component {
    private double capacity;

    public HardDrive(String name, String producer, String serialNumber, double capacity) {
        super(name, producer, serialNumber);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
