package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        client.setName("John Doe");
        client.setYear(2000);
        client.setAddress("Nincsen neki");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("Van neki");
        System.out.println(client.getAddress());

    }

}
