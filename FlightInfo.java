import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class FlightInfo {
    public String flightNo;
    public String source;
    public String destination;
    public String departure;
    public String arrival;
    public int fare;
    public int count;

    public FlightInfo(String flightNo, String source, String destination, 
                     String departure, String arrival, int fare, int count) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.fare = fare;
        this.count = count;
    }
}