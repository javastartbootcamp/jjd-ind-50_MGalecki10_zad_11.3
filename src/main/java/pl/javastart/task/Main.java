package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Memory memory = new Memory("ABC", "Intel", "1234", 4096, 1066, 30, 50);
        Processor processor = new Processor("DEF", "Intel", "3456", 4000, 40, 55);

        try {
            memory.overclock(100);
            System.out.println(memory);
        } catch (OverHeating ex) {
            System.err.println(ex);
        }

        try {
            processor.overclock(100);
            System.out.println(processor);
        } catch (OverHeating ex) {
            System.err.println(ex);
        }
    }
}
