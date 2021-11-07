public class digitalClock implements observer{

    private clockTimer timer;

    @Override
    public void update() {
        draw();
    }

    public digitalClock(clockTimer ct){
        timer = ct;
        timer.attach(this);
    }

    private void draw(){
        int hour = timer.getHour();
        int min = timer.getMinute();
        System.out.println("The current time is: " + hour + ":" + min);

    }

}
