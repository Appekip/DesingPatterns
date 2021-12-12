public class WallButton {

    CommandInterface cmd;

    public WallButton(CommandInterface cmd){
        this.cmd = cmd;
    }
    public void push()
    {
        cmd.execute();
    }

}