import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random r = new Random();

        List<String> lista = new ArrayList<String>();

        for (int i = 0; i < 9; i++){

            String x = "" + r.nextInt(20);

            lista.add(x);

        }

        class lC1 implements listConverter{

            @Override
            public String listToString(List li) {

                ListIterator<String> iterator = li.listIterator();

                String l = "";

                while (iterator.hasNext())
                {

                    String temp = iterator.next() + "\r\n";

                    l = l + temp;

                }

                return l;
            }

        }

        class lC2 implements listConverter{

            @Override
            public String listToString(List li) {

                ListIterator<String> iterator = li.listIterator();

                String l = "";

                int b = 0;

                while (iterator.hasNext())
                {
                    b++;

                    String temp;

                    if (b % 2 == 0){

                        temp = iterator.next() + "\r\n";

                        l = l + temp;

                    }

                    else {

                        temp = iterator.next();

                        l = l + temp + ",";
                    }

                }

                return l;
            }
        }

        class lC3 implements listConverter{

            @Override
            public String listToString(List li) {

                ListIterator<String> iterator = li.listIterator();

                String l = "";

                int b = 0;

                while (iterator.hasNext())
                {
                    b++;

                    String temp;

                    if (b % 3 == 0){

                        temp = iterator.next() + "\r\n";

                        l = l + temp;
                    }

                    else {

                        temp = iterator.next();

                        l = l + temp + ",";
                    }

                }

                return l;
            }
        }

        listConverter a = new lC1();

        listConverter b = new lC2();

        listConverter c = new lC3();

        System.out.println("Strategy 1");

        System.out.println(a.listToString(lista));

        System.out.println("Strategy 2");

        System.out.println(b.listToString(lista));

        System.out.println("Strategy 3");

        System.out.println(c.listToString(lista));

    }

}
