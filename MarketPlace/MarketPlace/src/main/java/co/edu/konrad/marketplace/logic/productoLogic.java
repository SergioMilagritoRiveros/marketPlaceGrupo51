/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.logic;

import co.edu.konrad.marketplace.entities.productoEntity;
import co.edu.konrad.marketplace.persistence.productoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 *manejo logica de producto.
 * @author Sergio E. Riveros R.
 */
@Stateless
public class productoLogic {

    @Inject
    private productoPersistence persistance;

    public List<productoEntity> obtenerProductos() {
        List<productoEntity> producto = persistance.encontrarTodos();
        return producto;

    }
    private productoEntity obtenerProducto(long id){
    productoEntity producto= persistance.encontrarPorId(id);
        if (producto==null) {
            throw new IllegalArgumentException("el producto esta vacio");
        }
    return producto;   
    }
    
    
}
