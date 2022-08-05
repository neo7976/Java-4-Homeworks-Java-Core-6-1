package weapon;

public class Gun extends Weapon {
    @Override
    public String shot() {
        String shot = "Пиу-пиу";
        System.out.println(shot);
        return shot;
    }
}
