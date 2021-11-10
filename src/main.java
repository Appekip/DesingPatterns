public class main {
    public static void main(String[] args) {

        pizza p1 = new blueCheese(new cheesePizza());

        System.out.println("Ingredients: " + p1.getIngridient());

        System.out.println("Price: " + p1.getPrice());


        pizza p2 = new pepperoni(new bacon(new ham(new cheesePizza())));

        System.out.println("Ingredients: " + p2.getIngridient());

        System.out.println("Price: " + p2.getPrice());


        pizza p3 = new blueCheese(new bacon(new cheesePizza()));

        System.out.println("Ingredients: " + p3.getIngridient());

        System.out.println("Price: " + p3.getPrice());



    }
}
