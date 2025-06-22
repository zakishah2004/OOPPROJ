import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class Schedule {
    public void viewSchedule() {
        System.out.println("\n\n\t\t\tDOMESTIC FLIGHT SCHEDULE\n\n");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-10s%n", 
            "Flight No", "Source", "Destination", "Departure", "Arrival", "Fare");
        System.out.println();

        String[][] flights = {
            {"IK121", "Islamabad", "Karachi", "9:00", "11:00", "8000"},
            {"IL122", "Islamabad", "Lahore", "10:00", "11:30", "6000"},
            {"IP123", "Islamabad", "Peshawar", "12:00", "13:50", "7000"},
            {"IM124", "Islamabad", "Multan", "22:00", "23:00", "5000"},
            {"KI121", "Karachi", "Islamabad", "12:00", "14:00", "8000"},
            {"KL122", "Karachi", "Lahore", "02:00", "3:30", "6500"},
            {"KP123", "Karachi", "Peshawar", "12:00", "1:20", "7500"},
            {"KM124", "Karachi", "Multan", "21:00", "23:00", "5000"},
            {"LI121", "Lahore", "Islamabad", "15:00", "16:30", "6000"},
            {"LK122", "Lahore", "Karachi", "10:00", "11:30", "6500"},
            {"LP123", "Lahore", "Peshawar", "12:00", "13:40", "8500"},
            {"LM124", "Lahore", "Multan", "22:00", "23:00", "6000"},
            {"PI121", "Peshawar", "Islamabad", "10:00", "11:50", "7000"},
            {"PK122", "Peshawar", "Karachi", "15:00", "16:20", "7500"},
            {"PL123", "Peshawar", "Lahore", "12:00", "13:40", "8500"},
            {"PM124", "Peshawar", "Multan", "21:00", "22:00", "5000"},
            {"MI121", "Multan", "Islamabad", "19:00", "20:00", "5000"},
            {"MK122", "Multan", "Karachi", "14:00", "16:00", "5000"}
        };

        for (String[] flight : flights) {
            System.out.printf("%-10s%-15s%-15s%-15s%-15s%-10s%n", 
                flight[0], flight[1], flight[2], flight[3], flight[4], flight[5]);
        }
    }
}