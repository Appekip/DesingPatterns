public class monni implements employee {

    employee responsible;

    //Input a wanted percentage as an int
    @Override
    public void askForRaise(int raise) {
        pass(responsible, raise);
    }

    @Override
    public void verify(int r) {
        System.out.println("Isn't able to verify anything");
    }

    @Override
    public void pass(employee e, int r) {
        e.verify(r);
    }

    public void setResponsible(employee responsible) {
        this.responsible = responsible;
    }

}
