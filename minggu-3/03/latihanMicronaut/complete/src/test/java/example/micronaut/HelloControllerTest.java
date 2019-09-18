/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package example.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest 
public class HelloControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client; 

    @Test
    public void testHello() {
        HttpRequest<String> request = HttpRequest.GET("/hello"); 
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hello World", body);
    }
}
//?[36m11:47:31.727?[0;39m ?[1;30m[Test worker]?[0;39m ?[34mINFO ?[0;39m ?[35mi.m.context.env.DefaultEnvironment?[0;39m - Established active environments: [test]
//

//> Task :run
//14:05:33.047 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 6313ms. Server Running: http://localhost:8080
