package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Bill bill = new Bill();
        Item kenyér = new Item();
        kenyér.setProduct("szeletelt");
        kenyér.setPrice(800);
        kenyér.setQuantity(2);

        bill.addItem(kenyér);

        Item tej = new Item();
        tej.setProduct("mizu");
        tej.setPrice(1520);
        tej.setQuantity(35);

        bill.addItem(tej);

        System.out.println(bill.calculateTotalPrice());
    }
}
