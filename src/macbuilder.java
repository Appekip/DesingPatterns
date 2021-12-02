public class macbuilder implements builder{

    burger mb;

    @Override
    public void build() {
        mb = new macburger();
    }

    @Override
    public void addIngredient(ingredient i) {
        //System.out.println("Adding " + i.getDesc());
        mb.add(i);
    }

    @Override
    public burger getBurger() {
        return mb;
    }
}
