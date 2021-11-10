public class bacon extends pizzaDecorator {

    double price = .77;

    String ing = "Bacon";

    public bacon(pizza pizzaX) {
        super(pizzaX);
    }

    public String getIngridient() {

        return pizzaZ.getIngridient() + ", " + ing;

    }

    public double getPrice() {

        return pizzaZ.getPrice() + price;

    }

}
