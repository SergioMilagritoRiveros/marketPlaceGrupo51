/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.carritoEntity;
import co.edu.konrad.marketplace.entities.clienteEntity;
import co.edu.konrad.marketplace.entities.productoEntity;

/**
 * Mapeo objeto relacional de la entidad carrito
 *
 * @author Sergio E. Riveros R.
 */
public class carritoDTO {

    /**
     * atributo id
     */
    private Long idCarrito;
    /**
     * atributo id de producto
     */
    private productoEntity idProducto;
    /**
     * atributo cliente
     */
    private clienteEntity cliente;
    /**
     * atributo cantidad
     */
    private Long cantidad;
    /**
     * atributo valor total
     */
    private double valorTotal;

    /**
     * constructor carrito DTO
     */
    public carritoDTO(carritoEntity car) {
        this.idCarrito = car.getIdCarrito();
        this.idProducto = car.getIdProducto();
        this.cliente = car.getIdCliente();
        this.cantidad = car.getCantidad();
        this.valorTotal = car.getValorTotal();
    }
    
    public carritoEntity toEntity() {
        carritoEntity carritoEntity = new carritoEntity();
        carritoEntity.setIdCarrito(this.idCarrito);
        carritoEntity.setIdCliente(this.cliente);
        carritoEntity.setIdCliente(this.cliente);
        carritoEntity.setCantidad(this.cantidad);
        carritoEntity.setValorTotal(this.valorTotal);
        return carritoEntity;
    }
    
    public Long getIdCarrito() {
        return idCarrito;
    }
    
    public void setIdCarrito(Long idCarrito) {
        this.idCarrito = idCarrito;
    }
    
    public productoEntity getIdProducto() {
        return idProducto;
    }
    
    public void setIdProducto(productoEntity idProducto) {
        this.idProducto = idProducto;
    }
    
    public clienteEntity getCliente() {
        return cliente;
    }
    
    public void setCliente(clienteEntity cliente) {
        this.cliente = cliente;
    }
    
    public Long getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
