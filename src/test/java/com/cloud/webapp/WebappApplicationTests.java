package com.cloud.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebappApplicationTests {

    @Autowired
    private MyController myController;

    @Autowired
    private MyService myService;

    @Test
    public void contextLoads() throws Exception {
        assertThat(myController).isNotNull();
        assertThat(myService).isNotNull();
    }
}
