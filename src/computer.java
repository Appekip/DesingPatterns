import java.util.ArrayList;
import java.util.List;

public class computer implements pcComponentIF{
    @Override
    public String getType() {
        return "Computer";
    }

    @Override
    public int getPrice() {
        int p = 0;

        for (int i = 0; i < allComponents.size(); i++){
            p += allComponents.get(i).getPrice();
        }

        return p;
    }

    @Override
    public void print() {
        allComponents.forEach(pcComponent::print);
        System.out.println("Total cost: " + getPrice());
    }

    @Override
    public String getName() {
        return null;
    }


    private List<pcComponent> allComponents;

    public computer(){
        this.allComponents = new ArrayList<pcComponent>();
    }

    public void addComponent(pcComponent p){

        allComponents.add(p);

    }

    public void removeComponent(pcComponent c){
        allComponents.remove(c);
    }

    public void buildAPc(){

        addComponent(newGPU("GPU", "RTX 3070", 900));
        addComponent(newCPU("CPU", "Ryzen 3700x", 400));
        addComponent(newRam("Ram", "Tricent Z Neo 16GB", 200));
        addComponent(newMB("Motherboard", "Asus X570-Pro", 300, "Wifi Module", 100));
        addComponent(newCase("Case", "Lian Li Pc011 D", 150, "Vertical GPU Bracket", 50));
        print();

    }

    public pcComponent newGPU(String x, String z, int y){
        return (pcComponent) new componentFactory().newComponent(x, z, y);
    }
    public pcComponent newCPU(String x, String z, int y){
        return (pcComponent) new componentFactory().newComponent(x, z, y);
    }
    public pcComponent newRam(String x, String z, int y){
        return (pcComponent) new componentFactory().newComponent(x, z, y);
    }
    public customComponent newMB(String x, String z, int y, String h, int l){
        return (customComponent) new componentFactory().newCustomComponent(x, z, y, h, l);
    }
    public customComponent newCase(String x, String z, int y, String h, int l){
        return (customComponent) new componentFactory().newCustomComponent(x, z, y, h, l);
    }
}
