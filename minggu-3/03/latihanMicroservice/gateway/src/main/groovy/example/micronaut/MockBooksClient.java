/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;

import groovy.lang.Singleton;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Flowable;

/**
 *
 * @author User's
 */
@Singleton
@Requires(env = Environment.TEST)
public class MockBooksClient implements BooksFetcher {

    @Override
    public Flowable<Book> fetchBooks() {
        return Flowable.just(new Book("1491950358", "Building Microservices"), new Book("1680502395", "Release It!"), new Book("0321601912", "Continuous Delivery:"));
    }
}
