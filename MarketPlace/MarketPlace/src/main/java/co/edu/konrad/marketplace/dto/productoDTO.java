/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.marketplace.dto;

import co.edu.konrad.marketplace.entities.productoEntity;

/**
 * Mapeo objeto relacional de la entidad producto
 *
 * @author Sergio E. Riveros R.
 */
public class productoDTO {

    /**
     * atributo id
     */
    private Long id;
    /**
     * atributo marca
     */
    private String marca;
    /**
     * atributo nombre del producto
     */
    private String nombreProducto;

    /**
     * atributo valor unitario
     */
    private Long valorUnitario;

    /**
     * constructor producto DTO
     */
    
    public productoDTO (productoEntity prod) {
        this.id = prod.getIdProducto();
        this.marca = prod.getMarca();
        this.nombreProducto = prod.getMarca();
        this.valorUnitario = prod.getValorUnitario();
    }

   

    public productoEntity toEntity(){
    productoEntity productoEntity=new productoEntity();
    productoEntity.setIdProducto(this.id);
    productoEntity.setMarca(this.marca);
    productoEntity.setNombreProducto(this.nombreProducto);
    productoEntity.setValorUnitario(this.valorUnitario);
    return productoEntity;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public long getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Long valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
