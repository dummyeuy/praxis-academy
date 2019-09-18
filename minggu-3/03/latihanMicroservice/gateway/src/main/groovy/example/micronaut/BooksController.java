/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import java.util.List;

/**
 *
 * @author User's
 */
@Controller("/api")
public class BooksController {

    private final BooksFetcher booksFetcher;
    private final InventoryFetcher inventoryFetcher;

    public BooksController(BooksFetcher booksFetcher, InventoryFetcher inventoryFetcher) {
        this.booksFetcher = booksFetcher;
        this.inventoryFetcher = inventoryFetcher;
    }
    
    @Get("/books") Flowable<Book> findAll() { 
        return booksFetcher.fetchBooks()
                   .flatMapMaybe(b -> inventoryFetcher.inventory(b.getIsbn())
                        .filter(stock -> stock > 0)
                        .map(stock -> { 
                            b.setStock(stock); 
                            return b; 
                        })
                    );

    }
    
}
