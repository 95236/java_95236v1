package pl.kubapawlik;

public class Tuple implements Comparable<Tuple> {
    private int number;
    private String description;

    public Tuple(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return description + " | " + number;
    }

    @Override
    public int compareTo(Tuple another) {
        return Integer.compare(number, another.getNumber());
    }
}
