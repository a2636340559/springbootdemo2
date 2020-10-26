package com.beic.springbootdemo2;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class Springbootdemo2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Before
    public void begin()
    {
        System.out.println("测试开始---------");
    }

    @After
    public void after()
    {
        System.out.println("测试结束------------");
    }

}
