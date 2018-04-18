/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest;

import java.util.Collections;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacade;

/**
 *
 * @author bryan
 * @param <T>
 */
public abstract class GenericRest<T> {
    
    /**
     * 
     * @return se espera que retorne el una interfaz de algun tipo para trabajar con el
     */
    protected abstract GenericFacade<T> getFacadeLocal();
    protected abstract T getNewEntity();
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<T> findAll() {
        try {
            if (getFacadeLocal() != null) {
                return getFacadeLocal().findAll();
            }
        } catch (Exception e) {
            System.out.println("ex: " + e);
        }

        return Collections.EMPTY_LIST;
    }
    
    @GET
    @Path("{inicio}/{tamanio}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<T> findRange(
            @PathParam("inicio") @DefaultValue("0") int inicio,
            @PathParam("tamanio") @DefaultValue("10") int tamanio) {
        try {
            if (getFacadeLocal() != null) {
                return getFacadeLocal().findRange(inicio, tamanio);
            }
        } catch (Exception e) {
            System.out.println("ex: " + e);
        }
        return Collections.EMPTY_LIST;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public T findById(
            @PathParam("id") int id) {
        try {
            if (getFacadeLocal() != null) {
                return getFacadeLocal().find(id);
            }
        } catch (Exception e) {
            System.out.println("ex: " + e);
        }
        return getNewEntity();
    }
    
    @GET
    @Path("pene")
    public String hostia() {
        return "CHINCHILLA SE LA COME :v";
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public T crear(T reg){
        if(reg != null){
            try {
                if (getFacadeLocal() != null) {
                    T u = getFacadeLocal().crear(reg);
                    if(u!=null){
                        return u;
                    }
                }
            } catch (Exception e) {
                System.out.println("ex: "+e);
            }
        }
        return getNewEntity();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public  T editar(T reg){
        if(reg != null){
            try {
                if (getFacadeLocal() != null) {
                    T u = getFacadeLocal().editar(reg);
                    if(u!=null){
                        return u;
                    }
                }
            } catch (Exception e) {
                System.out.println("ex: "+e);
            }
        }
        return getNewEntity();
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public T eliminar(@PathParam("id") int id){
        if(id > 0){
            try {
                if (getFacadeLocal() != null) {
                    T u = getFacadeLocal().remover(getFacadeLocal().find(id));
                    if(u!=null){
                        return u;
                    }
                }
            } catch (Exception e) {
                System.out.println("ex: "+e);
            }
        }
        return getNewEntity();
    }

}
