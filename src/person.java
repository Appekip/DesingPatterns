public class person implements human{

    String name;
    clothing hoodie;
    clothing jeans;
    clothing shoes;




    boolean graduationState;

    public person(String k, boolean b) {
        name = k;
        graduationState = b;
    }


    @Override
    public void dressUp() {

        hoodie = (clothing) factoryProvider.getFactory(graduationState).create("Hoodie");

        jeans = (clothing) factoryProvider.getFactory(graduationState).create("Jeans");

        shoes = (clothing) factoryProvider.getFactory(graduationState).create("Shoes");
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Graduation() {
        graduationState = true;
        System.out.println(name + " graduates");
    }

    @Override
    public boolean GState() {
        return graduationState;
    }

    @Override
    public void flex() {
    System.out.println("I " + name + " have a " + hoodie.toString() + " and " + jeans.toString() + " and a set of " + shoes.toString());
    }


}
