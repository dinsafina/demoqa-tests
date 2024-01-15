package junit;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class FirstJunitTest {

    @BeforeAll
    //нужен напр. для настройки конфигурации (1 раз настроили)
    static void beforeAll() {
        System.out.println("this is beforeAll() method");
    }

    @BeforeEach
    //нужен напр. для регистрации юзера перед каждым тестом
    void beforeEach() {
        System.out.println("this is beforeEach");
    }

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("this is first test");
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("this is second test");
    }

    @AfterEach
    //нужен напр. для очистки регистрации юзера после всех тестов
    void afterEach() {
        System.out.println("this is afterEach");
    }


    @AfterAll
    //нужен напр. для настройки конфигурации (1 раз настроили)
    static void afterAll() {
        System.out.println("this is afterAll() method");
    }
}
