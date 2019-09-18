/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;

import io.reactivex.Maybe;

/**
 *
 * @author User's
 */
public interface InventoryFetcher {
    Maybe<Integer> inventory(String isbn); 
}
