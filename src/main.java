public class main {

    public static void main(String[] args) {

        employee make = new monni();

        employee riku = new manager();

        employee elvis = new departmentManager();

        employee konna = new ceo();

        make.setResponsible(riku);
        riku.setResponsible(elvis);
        elvis.setResponsible(konna);

        make.askForRaise(2);
        System.out.println();
        make.askForRaise(4);
        System.out.println();
        make.askForRaise(6);

    }
}
