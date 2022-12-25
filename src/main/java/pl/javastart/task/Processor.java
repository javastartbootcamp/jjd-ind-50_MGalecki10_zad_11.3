package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    private double timing;
    private double temp;
    private double maxTemp;

    public Processor(String name, String producer, String serialNumber, double timing, double temp, double maxTemp) {
        super(name, producer, serialNumber);
        this.timing = timing;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public double getTiming() {
        return timing;
    }

    public void setTiming(double timing) {
        this.timing = timing;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public void overclock(double number) {
        setTiming(getTiming() + number);
        int diffTiming = (int) (number / 100);
        setTemp(getTemp() + (10 * diffTiming));
        if (getTemp() >= getMaxTemp()) {
            throw new OverHeating("Processor is overheating");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "timing= " + timing +
                ", temp= " + temp +
                ", maxTemp= " + maxTemp;
    }
}
