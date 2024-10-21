package service1;

public class FlyWithWings extends FlyBehavior {

    public FlyWithWings() {

    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }

    @Override
    public void fly() {

        System.out.println("I am flying");
    }

}
