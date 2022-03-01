public class Warrior extends Hero
{
    /***
     * Default constructor for an Warrior Hero Type
     */
    public  Warrior()
    {
        setHeroType("Warrior");
        setWeapon("Sword and Shield");
        setHp(80);
    }

    /***
     * Displays Warrior Chant
     */

    @Override
    public void chant()
    {
        System.out.println("Warrior Chant: I AM WARRIOR I Like Sword!!");

    }


}
