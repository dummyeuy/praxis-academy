/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
/**
 * source code diperoleh dari https://guides.micronaut.io/creating-your-first-micronaut-app/guide/index.html
 * @author asus
 */

@Controller("/hello") 
public class HelloController {
    @Get("/") 
    @Produces(MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World"; 
    }
}
