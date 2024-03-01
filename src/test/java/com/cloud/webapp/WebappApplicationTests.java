package com.cloud.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebappApplicationTests {

    @Autowired
    private WebappApplication webappApplicationebappApplication;

    @Test
    public void contextLoads() throws Exception {
        assertThat(webappApplicationebappApplication).isNotNull();
    }
}
