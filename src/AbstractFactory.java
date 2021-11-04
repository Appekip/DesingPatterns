public interface AbstractFactory<T>{
    T newComponent (String componentType, String componentName, int price);
    T newCustomComponent(String componentType, String componentName, int price, String configOption, int configPrice);
}
