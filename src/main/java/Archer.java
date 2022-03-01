public class Archer extends Hero
{
    /***
     * Default constructor for an Archer Hero Type
     */
    public  Archer()
    {
        setHeroType("Archer");
        setWeapon("Bow and Arrow");
        setHp(50);
    }

    /***
     * Chant method for Archer
     */
    @Override
    public void chant()
    {
        System.out.println("Archer Chant: I AM ARCHER I LIKE ARROWS!!");

    }


}
