public class clothing implements piece_of_clothing {
    String Brand;
    String Type;

    public clothing(String cT, String b) {
        Type = cT;
        Brand = b;

    }

    @Override
    public String getBrand() {
        return Brand;
    }

    @Override
    public String getClothingType() {
        return Type;
    }

    @Override
    public void setClothingType(String a) {

        Type = a;
    }

    @Override
    public void setBrand(String b) {

        Brand = b;
    }

    @Override
    public String toString() {

        return Brand + " branded " + Type;
    }



}
