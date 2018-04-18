/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacade;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.PasoFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Paso;

/**
 *
 * @author bryan
 */

@Path("Paso")
public class PasoRest extends GenericRest<Paso>{
    
    @EJB
    PasoFacadeLocal pasoFacade;

    @Override
    protected GenericFacade<Paso> getFacadeLocal() {
        return pasoFacade;
    }

    @Override
    protected Paso getNewEntity() {
        return new Paso();
    }
}
