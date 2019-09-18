/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;
import io.micronaut.context.annotation.Requires; 
import io.micronaut.context.env.Environment; 
import io.reactivex.Maybe;
import javax.inject.Singleton;
/**
 *
 * @author User's
 */

@Singleton 
@Requires(env = Environment.TEST)
public class MockInventoryClient implements InventoryFetcher{
    @Override 
    public Maybe<Integer> inventory(String isbn) { 
        if (isbn.equals("1491950358")) { 
            return Maybe.just(2); 
        } 
        if (isbn.equals("1680502395")) { 
            return Maybe.just(0); 
        } 
        return Maybe.empty();
    } 
}
