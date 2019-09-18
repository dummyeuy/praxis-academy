/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;

import io.reactivex.Flowable;
//import java.awt.print.Book;

/**
 *
 * @author User's
 */
public interface BooksFetcher {
    Flowable<Book> fetchBooks();
}
