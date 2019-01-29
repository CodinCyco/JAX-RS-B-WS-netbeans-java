
package com.library.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.library.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookByIdResponse_QNAME = new QName("http://ws.library.com/", "getBookByIdResponse");
    private final static QName _SuggestBookResponse_QNAME = new QName("http://ws.library.com/", "suggestBookResponse");
    private final static QName _GetBookById_QNAME = new QName("http://ws.library.com/", "getBookById");
    private final static QName _SuggestBook_QNAME = new QName("http://ws.library.com/", "suggestBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.library.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link SuggestBookResponse }
     * 
     */
    public SuggestBookResponse createSuggestBookResponse() {
        return new SuggestBookResponse();
    }

    /**
     * Create an instance of {@link SuggestBook }
     * 
     */
    public SuggestBook createSuggestBook() {
        return new SuggestBook();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.library.com/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<GetBookByIdResponse>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.library.com/", name = "suggestBookResponse")
    public JAXBElement<SuggestBookResponse> createSuggestBookResponse(SuggestBookResponse value) {
        return new JAXBElement<SuggestBookResponse>(_SuggestBookResponse_QNAME, SuggestBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.library.com/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<GetBookById>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.library.com/", name = "suggestBook")
    public JAXBElement<SuggestBook> createSuggestBook(SuggestBook value) {
        return new JAXBElement<SuggestBook>(_SuggestBook_QNAME, SuggestBook.class, null, value);
    }

}
