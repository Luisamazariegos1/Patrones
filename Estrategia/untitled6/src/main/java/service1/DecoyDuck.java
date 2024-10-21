package service1;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
    }

    @Override
    public void display() {
        {
            System.out.println("Hi I am a Decoy Duck");
        }

    }
    @Override
    public String toString() {
        return "DecoyDuck{}";
    }

}
