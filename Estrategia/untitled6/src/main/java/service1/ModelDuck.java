package service1;

public class ModelDuck extends Duck {

    public ModelDuck() {
        fb = new FlyNotWay();
        sb = new MuteSound();
    }

    @Override
    public String toString() {return "ModelDuck{}";
    }

    @Override
    public void display() {
        {
            System.out.println("i am a model duck ");


        }

    }

}

