public class cpu {

    public void jump(long position) {
        System.out.println("Changing to "+ position);
    }

    public void freeze() {
        System.out.println("Processor is frozen");
    }

    public void execute(long position) {
        System.out.println("Executing " +  position);
    }
}
