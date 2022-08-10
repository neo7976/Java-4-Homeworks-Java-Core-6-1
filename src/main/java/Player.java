import weapon.BigGun;
import weapon.Gun;
import weapon.RPG;
import weapon.Slingshot;
import weapon.WaterPistol;
import weapon.Weapon;

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

    public void setWeaponSlots(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
    }

    public Weapon[] getWeaponSlots() {
        return weaponSlots;
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public String shotWithWeapon(int slot) {
        String s = "";
        while (true) {
            // TODO проверить на выход за границы
            if (slot > (getSlotsCount()) - 1 || slot < 0) {
                System.out.println("Такого слота нет");
                break;
            }
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            //Огонь!
            s = weapon.shot();
            break;
        }
        return s;
    }

}

