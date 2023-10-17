package Zoo;

public class Mammal extends Animal{
    private int numberOfLegs;

    public Mammal(int numberOfLegs, int age, String name) {
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.name = name;
    }

    @Override
    public Animal breed() {
        return new Mammal(numberOfLegs,0,name);
    }

    @Override
    public void makeFeces() {
        System.out.println("poof!");
    }

    @Override
    public void move() {
        int i = 0;
        while (i < numberOfLegs){
            step();
            i++;
        }
    }

    public void step(){
        System.out.println("*heavy steps*");
    }

}
