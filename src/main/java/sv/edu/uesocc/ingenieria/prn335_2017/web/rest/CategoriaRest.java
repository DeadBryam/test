/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.CategoriaFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacade;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Categoria;

/**
 *
 * @author bryan
 */
@Path("Categoria")
public class CategoriaRest extends GenericRest<Categoria>{
    
    @EJB
    CategoriaFacadeLocal categoriaFacade;

    @Override
    protected GenericFacade<Categoria> getFacadeLocal() {
        return categoriaFacade;
    }

    @Override
    protected Categoria getNewEntity() {
        return new Categoria();
    }
    
}
