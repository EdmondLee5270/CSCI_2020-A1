import java.io.*;
public abstract class Hero
{
    /***
     *  GENERIC attrtibues for each Hero
     */

    private String hero_type;
    private String weapon;
    double hp;

    public abstract void chant();


    /***
     * Displays info the EnemyNPC
     */
    public void displayInfo()
    {
        System.out.println("Hero Info:");
        System.out.println("Hero: "+getHeroType());
        System.out.println("Hero Weapon: "+getWeapon());
        System.out.println("Hero HP: "+getHp());
    }

    /***
     * GETTERS
     */
    public String getHeroType() {
        return hero_type;
    }
    public String getWeapon() {
        return weapon;
    }
    public double getHp() {
        return hp;
    }

    /***
     * Setters
     */
    public void setHeroType(String enemy_type) {
        this.hero_type = enemy_type;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }

}
