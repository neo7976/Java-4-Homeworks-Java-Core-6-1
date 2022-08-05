import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class PlayerTests {
    Player sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Player();

    }
    @BeforeAll
    public static void started (){
        System.out.println("tests started");
    }


    @AfterEach
    public void finished() {
        System.out.println("test completed");
        sut = null;
    }

    @AfterAll
    public static void finishedAll (){
        System.out.println("tests completed");
    }

}
