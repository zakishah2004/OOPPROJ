import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class FlightInfo1 extends Flight {
    private FlightInfo[] flights = new FlightInfo[18];
    private int var;

    public void setFlightInfo() {
        flights[0] = new FlightInfo("IK121", "Islamabad", "Karachi", "9:00", "11:00", 8000, 100);
        flights[1] = new FlightInfo("IL122", "Islamabad", "Lahore", "10:00", "11:30", 6000, 100);
        flights[2] = new FlightInfo("IP123", "Islamabad", "Peshawar", "12:00", "13:50", 7000, 100);
        flights[3] = new FlightInfo("IM124", "Islamabad", "Multan", "22:00", "23:00", 5000, 100);
        flights[4] = new FlightInfo("KI121", "Karachi", "Islamabad", "12:00", "14:00", 8000, 100);
        flights[5] = new FlightInfo("KL122", "Karachi", "Lahore", "02:00", "3:30", 6500, 100);
        flights[6] = new FlightInfo("KP123", "Karachi", "Peshawar", "12:00", "1:20", 7500, 100);
        flights[7] = new FlightInfo("KM124", "Karachi", "Multan", "21:00", "23:00", 5000, 100);
        flights[8] = new FlightInfo("LI121", "Lahore", "Islamabad", "15:00", "16:30", 6000, 100);
        flights[9] = new FlightInfo("LK122", "Lahore", "Karachi", "10:00", "11:30", 6500, 100);
        flights[10] = new FlightInfo("LP123", "Lahore", "Peshawar", "12:00", "13:40", 8500, 100);
        flights[11] = new FlightInfo("LM124", "Lahore", "Multan", "22:00", "23:00", 6000, 100);
        flights[12] = new FlightInfo("PI121", "Peshawar", "Islamabad", "10:00", "11:50", 7000, 100);
        flights[13] = new FlightInfo("PK122", "Peshawar", "Karachi", "15:00", "16:20", 7500, 100);
        flights[14] = new FlightInfo("PL123", "Peshawar", "Lahore", "12:00", "13:40", 8500, 100);
        flights[15] = new FlightInfo("PM124", "Peshawar", "Multan", "21:00", "22:00", 5000, 100);
        flights[16] = new FlightInfo("MI121", "Multan", "Islamabad", "19:00", "20:00", 5000, 100);
        flights[17] = new FlightInfo("MK122", "Multan", "Karachi", "14:00", "16:00", 5000, 100);
    }

    public void compare(Scanner scanner) {
        getFlightNo(scanner);
        setFlightInfo();

        for (int i = 0; i < flights.length; i++) {
            if (flights[i].flightNo.equals(flightNo)) {
                var = i;
                display();
                break;
            }
        }
    }

    public void viewTicket() {
        try (BufferedReader br = new BufferedReader(new FileReader("E_ticket.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void seatsInfo() {
        flights[var].count--;
    }

    public void display() {
        try (PrintWriter out = new PrintWriter(new FileWriter("E_ticket.txt", true))) {
            out.println("FLIGHT NO: " + flights[var].flightNo);
            out.println("SOURCE: " + flights[var].source);
            out.println("DESTINATION: " + flights[var].destination);
            out.println("DEPARTURE: " + flights[var].departure);
            out.println("ARRIVAL: " + flights[var].arrival);
            out.println("FARE: " + flights[var].fare);
            out.println("STATUS: confirmed\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void showTicket2() {
        System.out.println("FLIGHT NO: " + flights[var].flightNo);
        System.out.println("SOURCE: " + flights[var].source);
        System.out.println("DESTINATION: " + flights[var].destination);
        System.out.println("DEPARTURE: " + flights[var].departure);
        System.out.println("ARRIVAL: " + flights[var].arrival);
        System.out.println("FARE: " + flights[var].fare);
        System.out.println("STATUS: confirmed\n");
        System.out.println("YOUR TICKET HAS BEEN BOOKED..... ENJOY YOUR FLIGHT");
    }
}
