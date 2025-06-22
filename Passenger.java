import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class Passenger {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String address;
    protected long cellNo;
    protected int pnr;

    public Passenger() {}

    public Passenger(String firstName, String lastName, int age, String address, long cellNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.cellNo = cellNo;
        this.pnr = new Random().nextInt(100);

        try (PrintWriter out = new PrintWriter(new FileWriter("E_ticket.txt", true))) {
            out.println("PNR NO: " + pnr);
            out.println("NAME: " + firstName + " " + lastName);
            out.println("AGE: " + age);
            out.println("CELL NO: " + cellNo);
            out.println("ADDRESS: " + address);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void showTicket1() {
        System.out.println("Ticket Information\n");
        System.out.println("NAME: " + firstName + " " + lastName);
        System.out.println("AGE: " + age);
        System.out.println("CELL NO: " + cellNo);
        System.out.println("ADDRESS: " + address + "\n");
    }
}
