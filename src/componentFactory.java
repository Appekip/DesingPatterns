public class componentFactory implements AbstractFactory{



    @Override
    public pcComponentIF newComponent(String componentType, String componentName, int price) {
        pcComponentIF c = new pcComponent(componentType, componentName, price);
        return c;
    }

    @Override
    public pcComponentIF newCustomComponent(String componentType, String componentName, int price, String configOption, int configPrice) {
        pcComponentIF cc = new customComponent(componentType, componentName, price, configOption, configPrice);
        return cc;
    }

}
