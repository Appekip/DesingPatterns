public class main {

    public static void main(String[] args) {

        macbuilder a = new macbuilder();

        a.build();
        a.addIngredient(new cheese());
        a.addIngredient(new bun());
        a.addIngredient(new meat());
        System.out.println(a.getBurger());

    }

}
