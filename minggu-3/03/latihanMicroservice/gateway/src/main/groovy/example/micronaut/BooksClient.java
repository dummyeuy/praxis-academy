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
import io.reactivex.Flowable;
//import java.awt.print.Book;

/**
 *
 * @author User's
 */
@Client("books")

@Requires(notEnv = Environment.TEST)
public interface BooksClient extends BooksFetcher {

    @Override @Get("/api/books") Flowable<Book> fetchBooks();
}
