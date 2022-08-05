import org.junit.jupiter.api.*;

public class PlayerTests {
    Player sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Player();

    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }


    @AfterEach
    public void finished() {
        System.out.println("test completed");
        sut = null;
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testShotWithWeapon() {
        //arrange
        int slot = 1;
        String weaponStr = "Пив-Пав";

        //act
        String result = sut.shotWithWeapon(1);
        //assert

    }

}
