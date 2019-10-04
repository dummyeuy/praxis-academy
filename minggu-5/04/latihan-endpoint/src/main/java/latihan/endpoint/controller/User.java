package latihan.endpoint.controller ;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.MediaType;

@Controller("/")
public class User {
    
    @Get(produces=MediaType.APPLICATION_JSON)
    public String index() {
        return "[{'username': 'muhammadghalib'}]";
    }
}