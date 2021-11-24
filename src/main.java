import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        List<Image> pics = new ArrayList<Image>();

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        pics.add(image1);
        pics.add(image2);

        for (int i = 0; i <pics.size(); i++){
                pics.get(i).showData();
        }

        Scanner s = new Scanner(System.in);

        int i = 0;

        while (true) {

            if (i == pics.size()) {
                i = 0;
            }

            s.nextLine();

            pics.get(i).displayImage();

            i++;
        }

    }
}
