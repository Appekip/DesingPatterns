public class manager implements employee{

    employee responsible;

    //Input a wanted percentage as an int
    @Override
    public void askForRaise(int raise) {
        pass(responsible, raise);
    }

    @Override
    public void verify(int r) {
        if (r < 3){
         System.out.println("Raise accepted by Manager");
        }

        else {
            System.out.println("Application is forwarded to Department Manager");
            pass(responsible, r);
        }
    }

    @Override
    public void pass(employee e, int r) {
        e.verify(r);
    }

    public void setResponsible(employee responsible) {
        this.responsible = responsible;
    }
}
