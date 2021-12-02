public class bottleAdapter implements bottleAdapterIf{

    public bottleAdapter(double v) {
        this.v = v;
    }

    double v;

    @Override
    public double volume() {
        return convertToOunces();
    }

    public double convertToOunces(){
        return v * 33.81;
    }


}
