public class bossFactory implements AbstractFactory{

    String brand = "Boss";
    @Override
    public piece_of_clothing create(String clothingType) {
        piece_of_clothing c = new clothing(clothingType, brand);
        return c;
    }
}
