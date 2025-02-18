package servicio;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * REST Web Service
 *
 * @author nico0
 */

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(servicio.DataCreditoService.class);
        resources.add(servicio.Operaciones.class);
        resources.add(servicio.VerificacionCrediticiaService.class);
    }
    
}
