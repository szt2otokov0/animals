package Zoo;

public class Egg {
    private final Eggable specimen;
    public Egg(Eggable specimen){
        this.specimen = specimen;
    }

    public Eggable hatch() {
        return specimen;
    }
}
