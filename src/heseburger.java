import java.util.ArrayList;
import java.util.List;

public class heseburger implements burger{

    List brgr = new ArrayList();

    public void add(ingredient i) {
        //System.out.println("Adding " + i.getDesc());
        brgr.add(i);
    }

}
