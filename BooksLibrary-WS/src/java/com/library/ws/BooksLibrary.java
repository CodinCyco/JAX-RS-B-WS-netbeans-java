/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author saifeddine
 */
@WebService(serviceName = "BooksLibrary")
public class BooksLibrary {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getBookById")
    public Book getBookById(@WebParam(name = "book_id") int book_id) {
        //TODO write your implementation code here:
         
        return new Book(1,123456879,"book one","author one","some infos");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suggestBook")
    public int suggestBook(@WebParam(name = "book") Book book) {
        //TODO write your implementation code here:
        return book.getId();
    }
    
    
    
    

    
    
}
