package taskSecond;

import org.junit.jupiter.api.*;
import taskSecond.Main;
import taskSecond.User;
import taskSecond.UserNotFoundException;

public class MainTests {
    Main sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Main();

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
    public void testGetUserByLoginAndPassword() throws UserNotFoundException {
        //arrange
        String login = "dimaBag@yandex.ru";
        String password = "1111aaaa";
        User expected = new User("Dima", "dimaBag@yandex.ru", "1111aaaa", 18);

        //act
        User result = sut.getUserByLoginAndPassword(login, password);

        //

        Assertions.assertEquals(expected.getLogin(),result.getLogin());
        Assertions.assertEquals(expected.getPassword(),result.getPassword());

    }

    @Test
    public void validateUser() {

    }


}
