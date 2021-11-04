public class customComponent extends pcComponent{

    private int configPrice;

    private String configOption;



    public customComponent(String componentType, String componentName, int price, String configOption, int configPrice) {
        super(componentType, componentName, price);
        this.configPrice = configPrice;
        this.configOption = configOption;
    }

    public int getPrice() {
        return price + configPrice;
    }

    public String toString(){
        return name +  ", " + type +  ", " + price + ", " + configOption + ", " + configPrice;
    }


    public void print(){
        System.out.println(name +  ", " + type +  ", " + price + ", " + configOption + ", " + configPrice);
    }


}
