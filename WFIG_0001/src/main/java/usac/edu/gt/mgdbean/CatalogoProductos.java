/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.mgdbean;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import usac.edu.gt.session.local.ProductoFacadeLocal;

/**
 *
 * @author juanr
 */
@Named
@RequestScoped
public class CatalogoProductos {
    
    private String nombreAplicacion;
    
    @EJB
    private ProductoFacadeLocal productoFacadeLocal;
    
    @PostConstruct
    public void init(){
        nombreAplicacion = "CatalogoProductos";
    }
    
    @PreDestroy
    public void destroy(){
        
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }
    
    
}