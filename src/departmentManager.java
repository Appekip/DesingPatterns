public class departmentManager implements employee{

    employee responsible;

    //Input a wanted percentage as an int
    @Override
    public void askForRaise(int raise) {
        pass(responsible, raise);
    }

    @Override
    public void verify(int r) {
        if (r < 5){
            System.out.println("Raise accepted by Department Manager");
        }

        else {
            System.out.println("Application is forwarded to CEO");
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
