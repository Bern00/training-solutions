package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    Scanner scanner = new Scanner(System.in);

    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void officeRead() {

        System.out.println("Kérem adja meg hány db iroda van:");

        int szam = scanner.nextInt();

        for(int i = 0; i < szam; i++) {

            System.out.println("Kérem adja meg az iroda nevét:");
            String name = scanner.next();

            System.out.println("Kérem adja meg az iroda hosszát:");
            int szam1 = scanner.nextInt();

            System.out.println("Kérem adja meg az iroda szélességét:");
            int szam2 = scanner.nextInt();

            MeetingRoom meetingRoom = new MeetingRoom(name, szam1, szam2);
            meetingRooms.add(meetingRoom);

        }

    }


    public void printMenu() {

        List<String> menu = new ArrayList<>();

        menu.add("1. Tárgyalók sorrendben");
        menu.add("2. Tárgyalók visszafele sorrendben");
        menu.add("3. Minden második tárgyaló");
        menu.add("4. Területek");
        menu.add("5. Keresés pontos név alapján");
        menu.add("6. Keresés névtöredék alapján");
        menu.add("7. Keresés terület alapján");

        for(int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

    }

    public void printNames() {
        for(MeetingRoom mr: meetingRooms) {
            System.out.println(mr.getName());
        }
    }

    public void printNamesReverse() {
        for(int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }

    }

    public void printEvenNames() {
        for(int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }


    public void printArea() {
        for(int i = 0; i < meetingRooms.size(); i++) {

            System.out.println("A tárgyaló neve: " + meetingRooms.get(i).getName() +
                    "\nA tárgyaló hossza: " + meetingRooms.get(i).getLength() + "(m)" +
                    "\nA tárgyaló szélessége: " + meetingRooms.get(i).getWidth() + "(m)" +
                    "\nA tárgyaló területe: " + meetingRooms.get(i).getArea() + "(nm)");

        }
    }

    public void printMeetingRoomsWithName(String keresettName) {

        for(MeetingRoom meetingRoom: meetingRooms) {

            if(meetingRoom.getName().equals(keresettName)) {

                System.out.println("A tárgyaló hossza: " + meetingRoom.getLength() + "(m)" +
                        "\nA tárgyaló szélessége: " + meetingRoom.getWidth() + "(m)" +
                        "\nA tárgyaló területe: " + meetingRoom.getArea() + "(nm)");
            }
        }
    }

    public void printMeetingRoomsContains(String partOfName) {

        for(MeetingRoom meetingRoom: meetingRooms) {

            if(meetingRoom.getName().toLowerCase().contains(partOfName.toLowerCase())) {

                System.out.println("A tárgyaló hossza: " + meetingRoom.getLength() + "(m)" +
                        "\nA tárgyaló szélessége: " + meetingRoom.getWidth() + "(m)" +
                        "\nA tárgyaló területe: " + meetingRoom.getArea() + "(nm)");
            }
        }

    }

    public void printAreasLargerThan(int keresettMeret) {

        for(MeetingRoom meetingRoom: meetingRooms) {
            if(meetingRoom.getArea() > keresettMeret) {
                System.out.println("A tárgyaló neve: " + meetingRoom.getName() +
                        "\nA tárgyaló hossza: " + meetingRoom.getLength() + "(m)" +
                        "\nA tárgyaló szélessége: " + meetingRoom.getWidth() + "(m)" +
                        "\nA tárgyaló területe: " + meetingRoom.getArea() + "(nm)");
            }
        }
    }

    public void runMenu() {

        for(int i = 0; i < 7; i++) {

            System.out.println("Kérem válasszon egy menüpontot:");

            String menuszama = scanner.next();

            if (menuszama.equals("1")) {
                printNames();
            }
            else if (menuszama.equals("2")) {
                printNamesReverse();
            }
            else if (menuszama.equals("3")) {
                printEvenNames();
            }
            else if (menuszama.equals("4")) {
                printArea();
            }
            else if (menuszama.equals("5")) {
                System.out.println("Kérem adja meg, melyik tárgyalót keresi:");
                String beutottNev = scanner.next();
                printMeetingRoomsWithName(beutottNev);
            }
            else if (menuszama.equals("6")) {
                System.out.println("Kérem adja meg, melyik tárgyalót keresi:");
                String beutottNevReszlet = scanner.next();
                printMeetingRoomsContains(beutottNevReszlet);
            }
            else if (menuszama.equals("7")) {
                System.out.println("Kérem adja meg, mekkora tárgyalót keres:");
                int beutottMeret = scanner.nextInt();
                printAreasLargerThan(beutottMeret);
            }
            else {
                System.out.println("Viszlát!! :)");
                return;
            }

        }
    }

}
