/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.micronaut;

/**
 *
 * @author User's
 */
public class Book {
    private String isbn; 
     private String name; 
     private Integer stock;
     
     public Book() {}

     public Book(String isbn, String name) { 
         this.isbn = isbn; 
         this.name = name; 
     }

     public String getIsbn() { return isbn; }

     public void setIsbn(String isbn) { this.isbn = isbn; }

     public String getName() { return name; }

     public void setName(String name) { this.name = name; }
     
     public Integer getStock() { return stock; }

     public void setStock(Integer stock) { this.stock = stock; }
}
