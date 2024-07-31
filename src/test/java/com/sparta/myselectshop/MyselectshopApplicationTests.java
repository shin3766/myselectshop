package com.sparta.myselectshop;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyselectshopApplicationTests {
    
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll 실행 :: static 사용");
    }
    
    @AfterAll
    static void afterAll() {
        System.out.println("afterAll 실행 :: static 사용");
    }
    
    
    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트 코드가 실행되기전에 수행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트 코드가 실행된 후에 수행");
    }

    @Test
    void contextLoads() {
        System.out.println("테스트가 수행되었습니다.");
    }

    @Nested
    @DisplayName("주제 별로 테스트를 그룹지어서 파악하기 좋습니다.")
    class Test1 {
        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Test
        @DisplayName("Test1 - test2()")
        void test2() {
            System.out.println("Test1.test2");
        }
    }

    @Nested
    @DisplayName("Test2 다른 주제")
    class Test2 {
        @Test
        @DisplayName("Test2 - test1()")
        void test1() {
            System.out.println("Test2.test1");
        }

        @Test
        @DisplayName("Test2 - test2()")
        void test2() {
            System.out.println("Test2.test2");
        }
    }
    


}
