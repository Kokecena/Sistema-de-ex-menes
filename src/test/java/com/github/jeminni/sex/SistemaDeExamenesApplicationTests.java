package com.github.jeminni.sex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SistemaDeExamenesApplicationTests {

    @Test
    void contextLoads() {
        String str = "Hola mundo";
        Assert.hasText(str,"Tiene un mensaje waos");
    }

}
