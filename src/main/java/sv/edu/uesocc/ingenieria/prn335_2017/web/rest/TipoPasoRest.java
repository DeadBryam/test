/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacade;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPasoFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;

/**
 *
 * @author bryan
 */

@Path("TipoPaso")
public class TipoPasoRest extends GenericRest<TipoPaso>{
    
    @EJB
    TipoPasoFacadeLocal tipoPasoFacade;

    @Override
    protected GenericFacade<TipoPaso> getFacadeLocal() {
        return tipoPasoFacade;
    }

    @Override
    protected TipoPaso getNewEntity() {
        return new TipoPaso();
    }
    
    
}
