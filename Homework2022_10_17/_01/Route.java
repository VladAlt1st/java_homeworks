package Homework2022_10_17._01;

public class Route {
    private String number;
    private String from;
    private String destination;
    private long distance;

    public Route(String number, String from, String destination, long distance) {
        this.number = number;
        this.from = from;
        this.destination = destination;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("route number - %s\n %s - %s\n distance = %d",
                number, from, destination, distance);
    }

    public long getDistance() {
        return distance;
    }
}
