public class main {
    public static void main(String[] args) {

        bottle wb = new waterBottle();

        bottleAdapterIf ba = new bottleAdapter(wb.volume());

        System.out.println(ba.volume());
    }
}
