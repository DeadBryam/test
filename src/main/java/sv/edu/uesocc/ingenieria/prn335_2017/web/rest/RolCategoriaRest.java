/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacade;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.RolCategoriaFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.RolCategoria;

/**
 *
 * @author bryan
 */
@Path("RolCategoria")
public class RolCategoriaRest extends GenericRest<RolCategoria>{
    
    @EJB
    RolCategoriaFacadeLocal rolCategoriaFacade;

    @Override
    protected GenericFacade<RolCategoria> getFacadeLocal() {
        return rolCategoriaFacade;
    }

    @Override
    protected RolCategoria getNewEntity() {
        return new RolCategoria();
    }
    
    
}
