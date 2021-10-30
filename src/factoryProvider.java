public class factoryProvider {
    public static AbstractFactory getFactory(boolean choice){

        if(choice == false){
            return new adidasFactory();
        }
        else {
            return new bossFactory();
        }


    }
}
