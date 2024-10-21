package service1;

import lombok.Setter;

@Setter
public abstract class Duck {

    protected FlyBehavior fb;
    protected SoundBehavior sb;


    public void swim(){ System.out.println("The duck is swimming");}
    public void performFly(){ fb.fly();}
    public void performQuack(){sb.sound();
    }

    @Override
    public String toString() { return "Duck{}";
    }public Duck() {
    }
    public abstract void display();
}
