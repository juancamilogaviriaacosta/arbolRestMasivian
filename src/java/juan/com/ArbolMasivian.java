package juan.com;

import java.io.StringReader;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import juan.com.modelo.Arbol;
import juan.com.modelo.Nodo;

/**
 *
 * @author juan
 */
@Path("/")
public class ArbolMasivian {

    @Context
    private UriInfo context;

    @EJB
    private ArbolStateless as;

    public ArbolMasivian() {
    }

    @GET
    @Path("getAncestro/{n1}/{n2}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAncestro(@PathParam("n1") String n1, @PathParam("n2") String n2) {
        try {
            Nodo ancestor = as.getArbol().ancestor(as.getArbol().getRaiz(), Integer.valueOf(n1), Integer.valueOf(n2));
            return "{\"ancestro\": " + (ancestor != null ? ancestor.getValor() : "\"no existe\"") + "}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"datos de entrada erroneos\" : \"" + e.getMessage() + "\"}";
        }
    }

    @PUT
    @Path("putArbol")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String putArbol(String content) {
        try {
            JsonReader jsonReader = Json.createReader(new StringReader(content));
            JsonObject json = jsonReader.readObject();
            String[] split = json.getString("arbol").split(",");
            as.setArbol(new Arbol());
            for (String tmp : split) {
                as.getArbol().agregar(Integer.valueOf(tmp.trim()));
            }
            return "{\"proceso exitoso\" : \"ok\"}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"datos de entrada erroneos\" : \"" + e.getMessage() + "\"}";
        }
    }
}
