package Zoo;

public abstract class Animal {
    protected int age;
    protected String name;

    public abstract Animal breed();
    //extra fields+methods
    private int height;
    private int weight;

    public abstract void makeFeces();
    public abstract void move();
}
