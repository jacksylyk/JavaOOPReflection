public interface Flyable {

    default void fly(double quantity){
        System.out.println("fuel will decrease by :" + quantity);
    }

    void refill(double quantity);
}
