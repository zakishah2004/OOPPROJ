import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class Flight {
    protected String flightNo;

    public void getFlightNo(Scanner scanner) {
        System.out.println("Enter your flight no");
        flightNo = scanner.nextLine();
    }
}