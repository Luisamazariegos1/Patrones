package service1;

public class FlyLikeRocket extends FlyBehavior {


    public FlyLikeRocket() {


    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }

    @Override
    public void fly() {

        System.out.println("I fly to space");
    }

}
