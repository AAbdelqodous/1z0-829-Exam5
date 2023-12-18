package q27;

public class Test {
    public static void main(String[] args) {
        /* Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying High...");
            }
        }; */

        var flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying High..");
            }
            public void stop(){
                System.out.println("Stop!");
            }
        };
        flyable.fly();
        flyable.stop();
        // Variable 'flyable' infers to anonymous inner class implementing Flyable interface.
        // The anonymous inner class correctly overrides fly() method and provides a new stop() method.
        // Both these methods can be invoked on reference variable 'flyable' as it is of anonymous inner class type.
    }
}
