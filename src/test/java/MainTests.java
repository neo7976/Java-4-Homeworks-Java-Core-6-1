import org.junit.jupiter.api.*;

public class MainTests {
    Main sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Main();

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


    @Test
    void name() {
    }
}
