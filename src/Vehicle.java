public class Vehicle {
    int seats;
    String brand;
    public Vehicle(int seats, String brand) {
        this.seats = seats;
        this.brand = brand;
    }

    public void move() {
        System.out.println(brand + " vehicle with " + seats + " seats moves");
    }
}
