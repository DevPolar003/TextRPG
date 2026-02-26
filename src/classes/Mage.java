package classes;

public class Mage extends Entity {
    
    private int mana;

    public Mage(double velocity, int life, int mainAttack, int armor, int magicDefense, int mana){
        super(velocity ,life ,mainAttack ,armor, magicDefense);
        this.mana = mana;
    }

    @Override
    public void attack(){
        if(mana > 0){
            System.out.println("The mage invoques a big big fat tung tung sahul");
            mana -= 10;
        }else{
            System.out.println("sorry lil bro, there is no mana for you");
        }
    }
    
}
