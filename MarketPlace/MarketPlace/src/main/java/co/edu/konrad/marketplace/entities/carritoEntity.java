/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entidad carrito
 *
 * @author Sergio E. Riveros R.
 */
@Entity
public class carritoEntity implements Serializable {

    /*
    *llave primaria 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito")
    private Long idCarrito;
    /*
    * atributo many to one cliente
     */
    @ManyToOne
    @JoinColumn(name = "cliente")
    private clienteEntity idCliente;
    /*
    *atributo atributo many to one producto
     */
    @ManyToOne
    @JoinColumn(name = "producto")
    private productoEntity idProducto;
    /*
    *atributo cantidad
     */
    @Column(name = "cantidad")
    private long cantidad;
    /*
    *atributo valor total
     */
    @Column(name = "valor_total")
    private double valorTotal;

    public carritoEntity() {
    }

    public Long getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }

    public clienteEntity getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(clienteEntity idCliente) {
        this.idCliente = idCliente;
    }

    public productoEntity getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(productoEntity idProducto) {
        this.idProducto = idProducto;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
