import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.*;
import weapon.BigGun;
import weapon.RPG;
import weapon.WaterPistol;
import weapon.Weapon;


public class PlayerTests {
    Player player;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        player = new Player();

    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }


    @AfterEach
    public void finished() {
        System.out.println("test completed");
        player = null;
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testShotWithWeapon() {

        player.setWeaponSlots(new Weapon[]{
                new RPG(),
                new BigGun()
        });

        //arrange
        int slot = 1;
        String expected = "Пив-Пав";

        //act
        String result = player.shotWithWeapon(slot);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testShotWithWeaponHamcrest() {
        player.setWeaponSlots(new Weapon[]{
                new RPG(),
                new BigGun()
        });

        //arrange
        int slot = 1;
        String expected = "ПИВ-ПАВ";

        //act
        String result = player.shotWithWeapon(slot);
        MatcherAssert.assertThat(expected, equalToIgnoringCase(result));
    }

    @Test
    void getSlotsCount() {
        Player player1 = new Player();
        player1.setWeaponSlots(new Weapon[]{
                        new BigGun(),
                        new RPG()
                }
        );

        int expected = 2;

        int result = player1.getSlotsCount();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void getSlotsCountHamcrest() {
        Player player1 = new Player();
        player1.setWeaponSlots(new Weapon[]{
                        new BigGun(),
                        new RPG(),
                        new WaterPistol()
                }
        );
        int result = player1.getSlotsCount();

        MatcherAssert.assertThat(result, is(equalTo(3)));

    }

}
