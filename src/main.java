public class main {
    public static void main(String[] args) throws InterruptedException {

            clockTimer b = new clockTimer();

            observer a = new digitalClock(b);

            b.attach((digitalClock) a);

            while (true){
                Thread.sleep(100);
                b.tick();
            }

    }
}
