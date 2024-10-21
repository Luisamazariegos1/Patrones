package service1;

public class MuteSound extends SoundBehavior {


    public MuteSound() {

    }
    @Override
    public String toString() {
        return "MuteSound{}";
    }

    @Override
    public void sound() {

        System.out.println("I am MuteSound");

    }

}
