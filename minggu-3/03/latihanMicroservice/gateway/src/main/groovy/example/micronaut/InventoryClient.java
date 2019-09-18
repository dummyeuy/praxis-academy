/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

/**
 *
 * @author User's
 */

@Client("inventory") 
@Requires(notEnv = Environment.TEST)
public interface InventoryClient extends InventoryFetcher{
    @Override 
    @Get("/api/inventory/{isbn}") 
    Maybe<Integer> inventory(String isbn);
}
