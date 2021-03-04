import java.lang.reflect.InvocationTargetException;

public class main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Flyable flyable = new Flyable() {
            @Override
            public void refill(double quantity) {
                System.out.println("fuel will increase by :" + quantity);
            }
        };
        flyable.fly(100);

        final Bird bird1 = Bird.class.getConstructor(double.class).newInstance(200);
        System.out.println(bird1);

        final Plane plane1 = Plane.class.getConstructor(double.class).newInstance(1000);
        System.out.println(plane1);
    }
}
