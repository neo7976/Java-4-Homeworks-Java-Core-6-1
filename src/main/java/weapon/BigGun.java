package weapon;

public class BigGun extends Weapon {
    @Override
    public String shot() {
        String shot = "Пив-Пав";
        System.out.println(shot);
        return shot;
    }
}
