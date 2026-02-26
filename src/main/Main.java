package main;

import java.util.ArrayList;
import java.util.List;

import classes.*;

public class Main{
    public static void main(String[] args) {
    List<Entity> characters = new ArrayList<>();        

    Warrior Razor = new Warrior(10.5, 100, 20, 15, 5, 50, "Razor");
    Mage Macoet = new Mage(8.0, 70, 40, 5, 20, 100, "Macoet");
    characters.add(Razor);
    characters.add(Macoet);


    for(Entity persona: characters){
            persona.attack();

            System.out.println(persona.getName() + "attacked");
        }
    }
}