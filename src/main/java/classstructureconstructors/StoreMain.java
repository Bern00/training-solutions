package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store dologstore = new Store("dolog");

        dologstore.store(5);
        dologstore.dispatch(1);

        System.out.println(dologstore.getProduct());
        System.out.println(dologstore.getStock());
    }

}
