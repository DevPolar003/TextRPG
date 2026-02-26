package classes;

public abstract class Entity{
    
    protected double velocity;
    protected int mainAttack;
    protected int life;
    protected int armor;
    protected int magicDefense;

    public Entity(double velocity, int mainAttack , int life, int armor, int magicDefense ){

        this.velocity = velocity;
        this.mainAttack = mainAttack;
        this.life = life;
        this.armor = armor;
        this.magicDefense = magicDefense;
    }

    public abstract void attack();
} 
