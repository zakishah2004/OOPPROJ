import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class AirwaysReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("\n\n\n\n\t\t\t\t\tSHAHEEN RESERVATION SYSTEM\n\n\n");

        while (running) {
            System.out.println("\t\t\t\t\t\tMAIN MENU\n\n");
            System.out.println("\t\t\t\t\t    1. Reserve Seat");
            System.out.println("\t\t\t\t\t    2. View Ticket");
            System.out.println("\t\t\t\t\t    3. Flights Schedule");
            System.out.println("\t\t\t\t\t    4. Quit\n\n");
            System.out.print("\t\t\t\t\t    Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (choice) {
                case 1:
                    boolean reserveAgain = true;
                    while (reserveAgain) {
                        System.out.println("Enter your first name");
                        String firstName = scanner.nextLine();
                        System.out.println("Enter your last name");
                        String lastName = scanner.nextLine();
                        System.out.println("Enter your address");
                        String address = scanner.nextLine();
                        System.out.println("Enter your age");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter your cell no");
                        long cellNo = Long.parseLong(scanner.nextLine());

                        Passenger passenger = new Passenger(firstName, lastName, age, address, cellNo);
                        FlightInfo1 flight = new FlightInfo1();
                        flight.compare(scanner);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        passenger.showTicket1();
                        flight.showTicket2();
                        flight.seatsInfo();

                        System.out.println("\n\npress 1 to reserve seat again: ");
                        System.out.println("press 2 to go to main menu: ");
                        int option = Integer.parseInt(scanner.nextLine());
                        if (option == 2) {
                            reserveAgain = false;
                        }
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                    break;

                case 2:
                    boolean viewAgain = true;
                    while (viewAgain) {
                        FlightInfo1 ticket = new FlightInfo1();
                        ticket.viewTicket();
                        System.out.println("\n\nPRESS 1 TO GO BACK TO MAIN MENU: ");
                        int option = Integer.parseInt(scanner.nextLine());
                        if (option == 1) {
                            viewAgain = false;
                        } else {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\n\n\n\n\n\n\n\n\t\t\t\tINVALID INPUT ENTER CORRECT OPTION AGAIN");
                            try { Thread.sleep(2500); } catch (InterruptedException e) {}
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    }
                    break;

                case 3:
                    boolean scheduleAgain = true;
                    while (scheduleAgain) {
                        Schedule schedule = new Schedule();
                        schedule.viewSchedule();
                        System.out.println("\n\nPRESS 1 TO GO BACK TO MAIN MENU: ");
                        int option = Integer.parseInt(scanner.nextLine());
                        if (option == 1) {
                            scheduleAgain = false;
                        } else {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\n\n\n\n\n\n\n\n\t\t\t\tINVALID INPUT ENTER CORRECT OPTION AGAIN");
                            try { Thread.sleep(2500); } catch (InterruptedException e) {}
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\t\t\t\tBYE BYE.. THANKS FOR VISITING SHAHEEN AIRWAYS\n\n");
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                    running = false;
                    break;

                default:
                    System.out.println("\n\n\n\n\n\n\n\n\t\t\t\tINVALID INPUT ENTER CORRECT OPTION AGAIN");
                    try { Thread.sleep(2500); } catch (InterruptedException e) {}
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
            }
        }
        scanner.close();
    }
}