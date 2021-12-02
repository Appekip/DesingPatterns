public class HesBurgerBuilder implements builder{

    burger hb;

    @Override
    public void build() {
        hb = new heseburger();
    }

    @Override
    public void addIngredient(ingredient i) {
        hb.add(i);
    }

    @Override
    public burger getBurger() {
        return hb;
    }
}
