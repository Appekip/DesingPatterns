public class cheesePizza implements pizza{

    double price = 2;

    String ing = "Cheese Pizza";


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getIngridient() {
        return ing;
    }
}
