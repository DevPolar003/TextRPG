package classes;

public abstract class Entity{
    protected String name; 
    protected double velocity;
    protected int mainAttack;
    protected int life;
    protected int armor;
    protected int magicDefense;

    public Entity(double velocity, int mainAttack , int life, int armor, int magicDefense, String name ){
        this.name = name;
        this.velocity = velocity;
        this.mainAttack = mainAttack;
        this.life = life;
        this.armor = armor;
        this.magicDefense = magicDefense;
    }

    public String getName(){
        return name;
    }

    public abstract void attack();
} 
