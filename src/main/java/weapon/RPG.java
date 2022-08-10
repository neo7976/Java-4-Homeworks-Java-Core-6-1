package weapon;

public class RPG extends Weapon {
    @Override
    public String shot() {
        String shot = "Бум..Бум..БУБУМ";
        System.out.println(shot);
        return shot;
    }
}
