package servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author nico0
 */

@Path("datacredito")
public class DataCreditoService {

    @GET
    @Path("/consulta/{idCliente}")
    public String consultaCredito(@PathParam("idCliente") String idCliente) {
        // Simula lógica de aprobación/rechazo
        if (idCliente.equals("636352")) {
            return "rechazado";
        }
        return "aprobado";
    }
}
