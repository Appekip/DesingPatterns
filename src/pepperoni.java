public class pepperoni extends pizzaDecorator {

    double price = .77;

    String ing = "Pepperoni";

    public pepperoni(pizza pizzaX) {
        super(pizzaX);
    }

    public String getIngridient() {

        return pizzaZ.getIngridient() + ", " + ing;

    }

    public double getPrice() {

        return pizzaZ.getPrice() + price;

    }

}
