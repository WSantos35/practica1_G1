/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import usac.edu.gt.entity.Producto;
import usac.edu.gt.session.local.ProductoFacadeLocal;

/**
 *
 * @author William
 */
@Stateless
public class ProductoFacade  extends AbstractFacade<Producto> 
        implements ProductoFacadeLocal {
    
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Resource
    private EJBContext ejbContext;

    public ProductoFacade() {
        super(Producto.class);
    }

    public void metodo1() {
        //LOGICA
    }

    public String metodo2() {
        String mensaje = "";
        //LOGICA
        return mensaje;
    }

}