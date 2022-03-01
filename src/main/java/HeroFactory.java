public class HeroFactory
{
    // Factory class
    public Hero HeroFactory(String hero)
    {
        if (hero==null)
        {
            return null;
        }

        // Used to create an Archer Hero Type
        if(hero.equalsIgnoreCase("Archer"))
        {
            return new Archer();
        }
        // Used to create  WIZZARD Hero Type
        else if (hero.equalsIgnoreCase("wizzard"))
        {
            return new Wizzard();
        }
        // Used to create  warrior Hero Type
        else if (hero.equalsIgnoreCase("warrior"))
        {
            return new Warrior();
        }



        return  null;

    }
}
