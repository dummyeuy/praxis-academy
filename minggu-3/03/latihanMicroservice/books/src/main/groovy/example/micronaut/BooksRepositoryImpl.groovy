/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */

package example.micronaut

import groovy.transform.CompileStatic
import javax.inject.Singleton
/**
 *
 * @author asus
 */
@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository{

    @Override
    List<Book> findAll() {
        [
            new Book("1491950358", "Building Microservices"),
            new Book("1680502395", "Release It!"),
        ]
        
    }
}

