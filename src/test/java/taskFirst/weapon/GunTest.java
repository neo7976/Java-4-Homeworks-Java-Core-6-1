package taskFirst.weapon;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GunTest {

    @BeforeEach
    void setUp() {
        System.out.println("test started");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test completed");
    }

    @Test
    void isTrueGunExtendWeapon() {
        MatcherAssert.assertThat(Gun.class, Matchers.typeCompatibleWith(Weapon.class));
    }
}