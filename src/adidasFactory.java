public class adidasFactory implements AbstractFactory{

    String brand = "Adidas";
    @Override
    public piece_of_clothing create(String clothingType) {
        piece_of_clothing c = new clothing(clothingType, brand);
        return c;
    }
}
