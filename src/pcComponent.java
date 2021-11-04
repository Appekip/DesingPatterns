public class pcComponent implements pcComponentIF{

      int price;

      String type;

      String name;

    public pcComponent(String componentType, String componentName, int price) {
        this.price = price;
        this.type = componentType;
        this.name = componentName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString(){
        return name +  ", " + type +  ", " + price;
    }

    @Override
    public void print() {
        System.out.println(name +  ", " + type +  ", " + price);
    }

    @Override
    public String getName() {
        return name;
    }


}
