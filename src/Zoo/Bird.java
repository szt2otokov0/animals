package Zoo;

public class Bird extends Animal implements Eggable{
    private final int age;
    private final String name;
    private boolean grounded = true;

    public Bird(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Animal breed() {
        Egg egg = layEggs();
        return (Animal) egg.hatch();
    }

    @Override
    public void makeFeces() {
        land();
        System.out.println("putty!");
    }

    @Override
    public void move() {
        if(grounded) waddle();
        else fly();
    }
    public void land(){
        System.out.println("*lands* poof!");
    }
    public void waddle(){
        System.out.println("waddling around...");
    }

    public void fly(){
        grounded = false;
        System.out.println("woosh! *flies off*");
    }

    @Override
    public Egg layEggs() {
        return new Egg(this);
    }
}
