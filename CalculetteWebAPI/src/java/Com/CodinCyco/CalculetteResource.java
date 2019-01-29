/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.CodinCyco;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author saifeddine
 */
@Path("calculette")
public class CalculetteResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculetteResource
     */
    public CalculetteResource() {
    }

    /**
     * Retrieves representation of an instance of Com.CodinCyco.CalculetteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        return "my first webservie";
    }
    
    /**
     * PUT method for updating or creating an instance of CalculetteResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
    
    @GET
    @Produces("text/plain")
    @Path("/plus/{i}/{j}")
    public String plus(@PathParam("i") int i,@PathParam("j") int j){
        return String.valueOf(i+j);
    }
    @GET
    @Produces("text/plain")
    @Path("/test")
    public String test(){
        return "test worked";
    }
}
