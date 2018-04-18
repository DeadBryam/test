/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacade;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.RolFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Rol;

/**
 *
 * @author bryan
 */
@Path("Rol")
public class RolRest extends GenericRest<Rol>{

    @EJB
    RolFacadeLocal rolFacade;
    
    @Override
    protected GenericFacade<Rol> getFacadeLocal() {
        return rolFacade;
    }

    @Override
    protected Rol getNewEntity() {
    return new Rol();
    }

    
    
}
