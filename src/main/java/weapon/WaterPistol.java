package weapon;

public class WaterPistol extends Weapon {
    @Override
    public String shot() {
        String shot = "Струя";
        System.out.println(shot);
        return shot;
    }
}
