public class Car extends Vehicle {
    
    int wheels;
    boolean hasEngine;


    public Car() {
        this("george lucas", true, -1);
    }

    public Car(String brand, boolean hasEngine, int wheels) {
        super(4, brand);
        this.hasEngine = hasEngine;
        this.wheels = wheels;
    }

    public void honk() {
        move();
        System.out.println(brand + " honks");
    }

    public void move() {
        System.out.println(brand + " car with " + seats + " seats moves");
    }


}
