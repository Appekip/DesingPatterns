class FlipDownCommand implements CommandInterface {

    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }
    @Override // Command
    public void execute() {
        light.turnOff();
    }

}
