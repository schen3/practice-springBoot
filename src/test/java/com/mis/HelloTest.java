package com.mis;

import com.msi.HelloApplication;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import com.sun.org.apache.xerces.internal.util.URI;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sianchen on 3/31/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class HelloTest {
    @Value("${local.server.port}")
    private int port;
    private URI base;
    private RestTemplate template;

    @Before
    public void setUp() throws Exception{
        this.base = new URI("http://localhost:"+port+"/");
        template = new RestTemplate();

    }
    @Test
    public void index() throws Exception{
        ResponseEntity<String> response =template.getForEntity(base.toString(),String.class);
        Assert.assertThat(response.getBody(), Matchers.equalTo("Hello world"));
    }
}
