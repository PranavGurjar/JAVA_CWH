interface Animal{
    void aniEat();
    void aniSleep();
}
class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}

class Human extends Monkey implements Animal{
    @Override
    public void aniEat() {
        System.out.println("animal Eat");
    }

    @Override
    public void aniSleep() {
        System.out.println("animal sleep");
    }
}

public class HumanMonkey {
    public static void main(String[] args) {
        //Problem 3 create inhertance and interface
        System.out.println("Problem 3 create inhertance and interface ");
        Human h = new Human();
        h.aniEat();
        h.aniSleep();
        h.bite();
        h.jump();

        //Problem 5 create polymorfism
        System.out.println("Problem 5 create polymorfism ");
        Monkey m = new Human();
        m.bite();
        m.jump();

        Animal a = new Human();
        a.aniEat();
        a.aniSleep();
    }
}
