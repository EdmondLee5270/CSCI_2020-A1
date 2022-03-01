public class Wizzard extends Hero
{
    /***
     * Default constructor for an Wizzard Hero Type
     */
    public  Wizzard()
    {
        setHeroType("Wizzard");
        setWeapon("Wand and Spell Book");
        setHp(40);
    }

    /***
     * Chant method for wizzard
     */
    @Override
    public void chant()
    {
        System.out.println("Wizzard Chant: I AM WIZZARD I Like Magic!!");

    }
}

