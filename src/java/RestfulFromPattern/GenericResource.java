/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestfulFromPattern;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author entrar
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {

    }

    /**
     * Retrieves representation of an instance of RestfulFromPattern.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        //int hora, minutos, segundos;
        Calendar calendario = Calendar.getInstance();  
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String hora2 = dateFormater.format(calendario.getTime());
        
        return "(\"Hora\" : \"" + hora2 + "\")";
        
        //hora =calendario.get(Calendar.HOUR_OF_DAY);
        //minutos = calendario.get(Calendar.MINUTE);
        //segundos = calendario.get(Calendar.SECOND);
        //return hora + ":" + minutos + ":" + segundos;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
