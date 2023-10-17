package Zoo;

public class Reptile extends Animal implements Eggable{

    @Override
    public Animal breed() {
        return null;
    }

    @Override
    public void makeFeces() {
        System.out.println("poop!");
    }

    @Override
    public void move() {
        for(int i = 0;i < 4;i++){
            step();
        }
    }

    public void step(){

    }

    @Override
    public Egg layEggs() {
        return new Egg(this);
    }
}
