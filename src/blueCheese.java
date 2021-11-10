public class blueCheese extends pizzaDecorator {

    double price = .45;

    String ing = "Blue Cheese";

    public blueCheese(pizza pizzaX) {
        super(pizzaX);
    }

    public String getIngridient() {

        return pizzaZ.getIngridient() + ", " + ing;

    }

    public double getPrice() {

        return pizzaZ.getPrice() + price;

    }

}
