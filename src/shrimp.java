public class shrimp extends pizzaDecorator {

    double price = .80;

    String ing = "Shrimp";

    public shrimp(pizza pizzaX) {
        super(pizzaX);
    }

    public String getIngridient() {

        return pizzaZ.getIngridient() + ", " + ing;

    }

    public double getPrice() {

        return pizzaZ.getPrice() + price;

    }

}