public class main {

    public static void main(String[] args){
        Light lamp = new Light();
        CommandInterface switchUp = new FlipUpCommand(lamp);
        CommandInterface switchDown = new FlipDownCommand(lamp);
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);
        button1.push();
        button2.push();
        button1.push();
    }

}
