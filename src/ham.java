public class ham extends pizzaDecorator {

    double price = .55;

    String ing = "Ham";

    public ham(pizza pizzaX) {
        super(pizzaX);
    }

    public String getIngridient() {

        return pizzaZ.getIngridient() + ", " + ing;

    }

    public double getPrice() {

        return pizzaZ.getPrice() + price;

    }

}