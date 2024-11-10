package homework;

/*. Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_10_Zone_1_Station {

    public static void main(String[] args) {

        Map<String, String> stationLine = new HashMap<>();

        stationLine = createStationLines();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the station name: ");
            String stationName = scanner.nextLine().trim();  // Trim to avoid extra spaces

            // Display the lines of station
            displayLinesForStation(stationName, stationLine);

        } catch (Exception e) {
            System.out.println("An error occurred while processing your input: " + e.getMessage());
        }

    }

    private static HashMap<String, String> createStationLines() {
        HashMap<String, String> stationLines = new HashMap<>();

        // Adding Zone 1 stations
        stationLines.put("Baker Street", "Bakerloo, Circle, Hammersmith & City, Metropolitan");
        stationLines.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationLines.put("Piccadilly Circus", "Bakerloo, Piccadilly");
        stationLines.put("King's Cross St. Pancras", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly");
        stationLines.put("Liverpool Street", "Central, Circle, Hammersmith & City, Metropolitan");
        stationLines.put("Leicester Square", "Northern, Piccadilly");
        stationLines.put("Bond Street", "Central, Jubilee");
        stationLines.put("Green Park", "Jubilee, Piccadilly, Victoria");
        stationLines.put("Holborn", "Central, Piccadilly");

        return stationLines;
    }

    // Method to get the lines of station
    private static void displayLinesForStation(String stationName, Map<String, String> stationLines) {
        if (stationLines.containsKey(stationName)) {
            System.out.println("The following lines pass through " + stationName + " : "
                    +stationLines.get(stationName));
        } else {
            System.out.println("Station not found or not in Zone 1.");
        }
    }

}
