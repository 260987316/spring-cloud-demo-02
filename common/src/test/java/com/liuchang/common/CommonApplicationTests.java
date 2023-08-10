package com.liuchang.common;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class CommonApplicationTests {

    @Test
    void contextLoads() {
        Map<String,String> map = new HashMap<>();
        map.put("k","v");
    }



}
