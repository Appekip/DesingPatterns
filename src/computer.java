public class computer {

    private cpu processor;
    private memory ram;
    private hardDrive hdd;

    public computer() {
        this.processor = new cpu();
        this.ram = new memory();
        this.hdd = new hardDrive();
    }

    public  void start() {
        processor.freeze();
        ram.load(3, hdd.read(2));
        processor.jump(4);
        processor.execute(4);
    }
}
