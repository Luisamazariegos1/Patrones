package service1;

public class Quack extends SoundBehavior {

    public Quack() {

    }

    @Override
    public String toString() {
        return "Quack{}";
    }

    @Override
    public void sound () {

        System.out.println("I am quack");
    }


}
