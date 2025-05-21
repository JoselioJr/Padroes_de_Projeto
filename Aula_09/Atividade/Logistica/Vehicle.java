import java.util.UUID;

public class Vehicle {
    private String id;
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.id = UUID.randomUUID().toString();
        this.model = model;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
