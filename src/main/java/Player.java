import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new BigGun(),
                new WaterPistol(),
                new Gun(),
                new RPG(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public String shotWithWeapon(int slot) {
        while (true) {
            // TODO проверить на выход за границы
            if (slot > (getSlotsCount()) - 1 || slot < 0) {
                System.out.println("Такого слота нет");
                break;
            }
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            //Огонь!
            weapon.shot();
            break;
        }
        return null;
    }

}

