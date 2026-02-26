package classes;

public class Warrior extends Entity {

    private int courage;

    public Warrior(double velocity, int life, int mainAttack, int armor, int magicDefense, int courage){
        super(velocity ,life ,mainAttack ,armor, magicDefense);
        this.courage = courage;

    }

   @Override
    public void attack() {
        System.out.println("bro attack with the sword!");
        courage += 5 ;
    }
}
