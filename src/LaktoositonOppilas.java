package factorymethod;

public class LaktoositonOppilas extends AterioivaOtus{

    public Juoma createJuoma(){
        return new Mehu();
    };

}
