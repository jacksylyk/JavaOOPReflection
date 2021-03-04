public class Bird implements Flyable{
    private double calories = 250;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Bird(double calories) {
        this.calories = calories;
    }

    @Override
    public void fly(double quantity) {
        calories -= quantity;
        System.out.println("Сalories left for the day :" + calories);
    }

    @Override
    public void refill(double quantity) {
        calories += quantity;
        System.out.println("Сalories left for the day :" + calories);
    }

    @Override
    public String toString() {
        return "Сalories left for the day :" + calories;
    }
}
