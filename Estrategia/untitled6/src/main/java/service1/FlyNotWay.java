package service1;

public class FlyNotWay extends FlyBehavior {

    @Override
        public void fly() {
            System.out.println("I cannot fly");
        }

    public FlyNotWay() {

        }

        @Override
        public String toString() {
            return "FlyNotWay{}";
        }
    }

