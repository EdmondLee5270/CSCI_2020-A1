/***
 * Sample driver class for the factory method example
 * Creating user Defined hero
 */

import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        int user_hero=0;
        // Creating the factory
        HeroFactory npcFactory = new HeroFactory();

        System.out.println("FACTORY DEMO");

        System.out.println("Select Hero Type to create");
        System.out.println("1. Archer");
        System.out.println("2. Wizzard");
        System.out.println("3. Warrior");
        System.out.print("Choose from Options (1-3): ");
        Scanner input = new Scanner(System.in);
        user_hero= input.nextInt();

        System.out.println();


        if(user_hero==1)
        {
            // using factory to create Archer Hero type
            Hero hero1= npcFactory.HeroFactory("archer");
            hero1.displayInfo();
            hero1.chant();

        }
        else if (user_hero==2)
        {
            // using factory to create a  Wizzard Hero type
            Hero hero1= npcFactory.HeroFactory("wizzard");
            hero1.displayInfo();
            hero1.chant();

        }
        else if (user_hero==3)
        {
            // using factory to create a Warrior Hero type
            Hero hero1= npcFactory.HeroFactory("warrior");
            hero1.displayInfo();
            hero1.chant();

        }










    }
}
