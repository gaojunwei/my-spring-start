package com.jack;

import com.example.MainApp;
import com.jack.start.demo.MyStarterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApp.class)
public class RabbitmqApplicationTests {
    @Autowired
    private MyStarterConfig myStarterConfig;

    @Test
    public void testMyStarter() {
        String name = myStarterConfig.getName();
        System.out.println(name);
    }
}

