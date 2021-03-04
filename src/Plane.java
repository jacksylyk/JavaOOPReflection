public class Plane implements Flyable{
    private double fuel = 500;

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Plane(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public void fly(double quantity) {
        fuel -= quantity;

    }

    @Override
    public void refill(double quantity) {
        fuel += quantity;
    }

    @Override
    public String toString() {
        return "Fuel left :" + fuel;
    }
}
