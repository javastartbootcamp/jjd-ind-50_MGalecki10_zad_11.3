package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private double ram;
    private double timing;
    private double temp;
    private double maxTemp;

    public Memory(String name, String producer, String serialNumber, double ram, double timing, double temp, double maxTemp) {
        super(name, producer, serialNumber);
        this.ram = ram;
        this.timing = timing;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
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
        setTemp(getTemp() + (15 * diffTiming));
        if (getTemp() >= getMaxTemp()) {
            throw new OverHeating("Memory is overheating");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "ram= " + ram +
                ", timing= " + timing +
                ", temp= " + temp +
                ", maxTemp= " + maxTemp;
    }
}
