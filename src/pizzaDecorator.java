public abstract class pizzaDecorator implements pizza{

    pizza pizzaZ;

    public pizzaDecorator(pizza pizzaX){

        pizzaZ = pizzaX;

    }

    public String getIngridient() {

        return pizzaZ.getIngridient();

    }

    public double getPrice() {

        return pizzaZ.getPrice();

    }

}
