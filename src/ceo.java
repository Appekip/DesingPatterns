public class ceo implements employee{

    employee responsible;

    //Input a wanted percentage as an int
    @Override
    public void askForRaise(int raise) {
        pass(responsible, raise);
    }

    @Override
    public void verify(int r) {
        System.out.println("Raise accepted by CEO");
    }

    @Override
    public void pass(employee e, int r) {
        e.verify(r);
    }

    public void setResponsible(employee responsible) {
        this.responsible = responsible;
    }
}
